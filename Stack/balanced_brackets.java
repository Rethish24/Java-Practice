import java.util.*;

class Solution{
    public void balancedBrackets(String s, int n)
    {
        // write code here
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='('||ch=='['||ch=='{')
            {
                st.push(ch);
            }
            else 
            {
                if(st.isEmpty()) //))))))
                {
                 System.out.println("NO");
                 return;
                }
                if(ch==')'&& st.peek()=='('||ch==']'&& st.peek()=='['||ch=='}'&& st.peek()=='{')
                {
                    st.pop();
                }
                else 
                {
                    System.out.println("NO");
                    return ;
                }
            }
        }
        if(st.isEmpty())
        {
            System.out.println("YES");
        }
        else
        {
             System.out.println("NO");
        }
    }
}

public class balanced_brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Solution Obj = new Solution();
        Obj.balancedBrackets(s, n);
    }
}

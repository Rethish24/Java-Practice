import java.util.*;

class Amstrong {
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		//write code here
    
        for(int i=1;i<=N;i++)
        {   int temp=0;
            int j=i;
            while(j>0)
            {
                int d=j%10;
                j=j/10;
                temp = temp+(d*d*d);
            }
            if( i == temp)
            {
                System.out.println(i);
            }
        }
    }
}

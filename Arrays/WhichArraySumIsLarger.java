import java.util.*;
public class WhichArraySumIsLarger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        n = sc.nextInt();
        int []arrA=new int[n];
        for(int i=0;i<n;++i){
                arrA[i]=sc.nextInt();
        }
        
        n = sc.nextInt();
        int []arrB=new int[n];
        for(int i=0;i<n;++i){
            arrB[i]=sc.nextInt();
        }
        
        System.out.println(ArrayProblem(arrA,arrB)); 
    }
    public static String ArrayProblem(int []arrA,int []arrB)
    {
       // Write code here
       int n=arrA.length;
       int a=0;
       int b=0;
       for(int i=0;i<n;i++)
       {
             a=a+arrA[i];
             b=b+arrB[i];
       }
       if (a>b)
       {
        return "First array is larger";
       }
       else
       {
        return "Second array is larger";
       }
    }
}
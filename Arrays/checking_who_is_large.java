import java.util.Scanner;
public class checking_who_is_large 
{
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
       int sum1=0;
       int sum2=0;
       for(int i=0;i<arrA.length;i++)
       {
        sum1=sum1+arrA[i];
       }
       for(int i=0;i<arrB.length;i++)
       {
        sum2=sum2+arrA[i];
       }
       String res=(sum1>sum2)?"First array is larger":"Second array is larger";
       return res;
    }    
}

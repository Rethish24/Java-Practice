package recursion_on_strings_2d_array;

import java.util.Scanner;

public class keypad_combination 
{
static void printKPC(String str,int i,String asf) 
    {
        //Write your code here
        if(i>str.length()-1)
        {
            System.out.println(asf);
            return ;
        }
        char ch=str.charAt(i);
        if(ch=='0')
        {
            printKPC(str,i+1,asf+".");
            printKPC(str,i+1,asf+";");

        }
        else if(ch=='1')
        {
            printKPC(str,i+1,asf+"a");
            printKPC(str,i+1,asf+"b");
            printKPC(str,i+1,asf+"c");
        }
        else if(ch=='2')
        {
            printKPC(str,i+1,asf+"d");
            printKPC(str,i+1,asf+"e");
            printKPC(str,i+1,asf+"f");
        }
        else if(ch=='3')
        {
            printKPC(str,i+1,asf+"g");
            printKPC(str,i+1,asf+"h");
            printKPC(str,i+1,asf+"i");
        }
        else if(ch=='4')
        {
            printKPC(str,i+1,asf+"j");
            printKPC(str,i+1,asf+"k");
            printKPC(str,i+1,asf+"l");
        }
        else if(ch=='5')
        {
            printKPC(str,i+1,asf+"m");
            printKPC(str,i+1,asf+"n");
            printKPC(str,i+1,asf+"o");
        }
        else if(ch=='6')
        {
            printKPC(str,i+1,asf+"p");
            printKPC(str,i+1,asf+"q");
            printKPC(str,i+1,asf+"r");
            printKPC(str,i+1,asf+"s");
        }
        else if(ch=='7')
        {
            printKPC(str,i+1,asf+"t");
            printKPC(str,i+1,asf+"u");
         
        }
         else if(ch=='8')
        {
            printKPC(str,i+1,asf+"v");
            printKPC(str,i+1,asf+"w");
            printKPC(str,i+1,asf+"x");
        }
        else if(ch=='9')
        {
               printKPC(str,i+1,asf+"y");
               printKPC(str,i+1,asf+"z");
        }




    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        printKPC(str,0,"");
    }    
}

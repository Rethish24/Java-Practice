public class Basics 
{
    public static void main(String args[])
    {   
        // comments are ignored by the compiler 

        // difference between print and println [Single Line Comment]

        /*
        print()  cursor after printing the content cursor stays in the sameline. 
                                                                                 [Multi Line Comment]
        but in println() after printing the content cursor moves in the nextline. 
        */
        System.out.println("hello");
        System.out.println("Yo");
    

        System.out.print("hello");
        System.out.println("Yo");


        System.out.print("hello");
        System.out.print("Yo");

        System.out.println("Escape characters");

        /*  Escape Characters in java 
        
        1. \n ---> next line 
        2. \t --->tab space
        3.  \" ---> "
        4.   \' ---> '
        5.  \\ --> \
        6.  \b ---> remove the previous character 
        */
       System.out.println("Hello\nWorld");
       System.out.println("Hello\tWorld");
       System.out.println("Hello World My Name is \"Rethish \" and i am \'student\'");
       System.out.println("Hello \\ World");
       System.out.println ("Hello\b0World");


        
    }
}
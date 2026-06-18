class angle_btw_hour_and_min{
    public static void main (String args[])
    {
       Scanner sc = new Scanner(System.in);
       double hour =sc.nextDouble(); 
       double minutes=sc.nextDouble(); 
       double result=0;
       double h=(hour%12)*30+ (0.5 * minutes);
       double min=minutes*6;
       result=Math.abs(h-min);
       result=Math.min(result,360-result);
       System.out.println(result);
    }
}

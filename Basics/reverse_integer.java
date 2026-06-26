class reverse_integer {
    public int reverse(int x) 
    {
        boolean n=(x<0);
      int temp=Math.abs(x);
      int ans=0;
      while(temp!=0)
      {
        int rem=temp%10;
        if(ans > (Integer.MAX_VALUE-rem) / 10) 
        {
            return 0;
        }
        ans=ans*10+rem;
        temp=temp/10;
      }
      return n? -ans:ans;
    }
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    int x=sc.nextInt();
    int res=reverse(x);
    System.out.println(res);
  }
}

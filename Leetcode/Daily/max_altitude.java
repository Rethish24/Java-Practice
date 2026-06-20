class max_altitude {
    public int largestAltitude(int[] gain) 
    {
        int ans[]=new int[(gain.length)+1];
        ans[0]=0;
        int max=0;
        for(int i=0;i<gain.length;i++)
        {
          ans[i+1]=gain[i]+ans[i];
          max=Math.max(max,ans[i+1]);
        }
        return max;
    }
}


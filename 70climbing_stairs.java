class Solution {
    
    
    public int climb_memo(int n, int [] dp)
    {
        if(n<=1)
        {
            dp[n] = 1;
        }
        
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int ans = climb_memo(n-1,dp) + climb_memo(n-2,dp);
        return dp[n] = ans;
        
    }
    public int climbStairs(int n) {
        int [] dp = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            dp[i] = 0;
        }
        return climb_memo(n,dp);
        
    }
}
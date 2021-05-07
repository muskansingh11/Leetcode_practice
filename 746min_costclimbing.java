class Solution {
    
    
    public int mincost(int n, int[] cost, int[] dp)
    {
        
        if(n<=1)
        {
           return dp[n] = cost[n];
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        
        int min_one = mincost(n-1,cost,dp);
        int min_two = mincost(n-2,cost,dp);
        int ans = Math.min(min_one,min_two) + (n!= cost.length ? cost[n] :0);
        return dp[n] = ans;
    }
    
    
    public int minCostClimbingStairs(int[] cost) {
      
        int n = cost.length;
        int [] dp = new int[n+1];
        int ans = mincost(n,cost,dp);
        return ans;
        
        
    }
}
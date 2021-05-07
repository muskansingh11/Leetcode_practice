class Solution {
public:
    
    int mincost(int n, vector<int>&cost,vector<int>&dp)
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
        int ans = min(min_one,min_two) + (n!= cost.size() ? cost[n] :0);
        return dp[n] = ans;
    }
    int minCostClimbingStairs(vector<int>& cost) {
        int n = cost.size();
        vector<int>dp(n+1,0);
         int ans = mincost(n,cost,dp);
        return ans;
        
    }
};
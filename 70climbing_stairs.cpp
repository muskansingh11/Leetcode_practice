class Solution {
public:
      int climb_memo(int n, vector<int>& dp)
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
    int climbStairs(int n) {
        vector<int> dp (n+1,0);       
        return climb_memo(n,dp);
    }
  
};
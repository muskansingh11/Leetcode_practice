class Solution {
    
    public int lpss(int i, int j, String s, int [][] dp)
    {
        if(i>=j)
        {
            return dp[i][j] = i==j ? 1 : 0;
        }
        if(dp[i][j]!= -1)
        {
            return dp[i][j];
        }
        if(s.charAt(i) == s.charAt(j))
          return dp[i][j] = lpss(i+1,j-1,s,dp) + 2;
        else
            return dp[i][j] = Math.max(lpss(i+1,j,s,dp),lpss(i,j-1,s,dp));
        
        
    }
    public int longestPalindromeSubseq(String s) {
        int m = s.length();
        int [][] dp = new int[m][m];
        for(int[]d :dp)
        {
            Arrays.fill(d,-1);
        }
        
        int ans = lpss(0,m-1,s,dp);
        return ans;
        
    }
}

class Solution {
    
    public int lpss(int I, int J, String s, int [][] dp)
    {
        int n = s.length();
        for(int gap = 0;gap<n;gap++)
        {
            for(int i=0,j=gap;j<n;i++,j++)
            {
                if(i>=j)
                {
                    dp[i][j] = (i==j )?1:0;
                    continue;
                }
                if(s.charAt(i) == s.charAt(j))dp[i][j] = dp[i+1][j-1]+2;
                else dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
            }
        }
        return dp[I][J];
        
    }
    public int longestPalindromeSubseq(String s) {
        int m = s.length();
        int [][] dp = new int[m][m];
//         for(int[]d :dp)
//         {
//             Arrays.fill(d,0);
//         }
        
        int ans = lpss(0,m-1,s,dp);
        return ans;
        
    }
}
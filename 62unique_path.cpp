class Solution {
public:
    int paths(int sr,int sc, int er, int ec, vector<vector<int>>&dir,vector<vector<int>>&dp)
    {
               if(sr == er && sc == ec)
        {
            return dp[sr][sc] = 1;
        }
        if(dp[sr][sc]!=0)
        {
            return dp[sr][sc];
        }
        
        int count = 0;
        for(int d=0;d<dir.size();d++)
        {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(r>=0 && r<=er && c>=0 && c<=ec)
            {
                count+= paths(r,c,er,ec,dir,dp);
            }
            
        }
        return dp[sr][sc] = count;
    }
    int paths_dp(int SR,int SC,int ER, int EC, vector<vector<int>>&dir, vector<vector<int>>&dp)
    {
        for(int sr = ER;sr>=0;sr--)
        {
            for(int sc = EC;sc>=0 ;sc--)
            {
                if(sr == ER && sc == EC)
                {
                    dp[sr][sc] = 1;
                    continue;
                }
                 int count = 0;
       
                 for(int d=0;d<dir.size();d++)
             
                 {
             
                     int r = sr + dir[d][0];
            
                     int c = sc + dir[d][1];
            
                     if(r>=0 && r<=ER && c>=0 && c<=EC)
          
                     {
                
                         count+= dp[r][c];
            
                     }
            
       
                 }
                dp[sr][sc] = count;
            }
        }
        return dp[SR][SC];
    }
    int uniquePaths(int m, int n) {
        vector<vector<int>>dp(m,vector<int>(n,0));
        vector<vector<int>> dir
        {
            {1,0},
            {0,1}
        };
         //int ans = paths_dp(0,0,m-1,n-1,dir,dp);
           int ans = paths(0,0,m-1,n-1,dir,dp);
        return ans;
        
    }
};
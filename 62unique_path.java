class Solution {
    
    public int paths(int sr,int sc, int er, int ec, int[][] dir,int[][]dp)
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
        for(int d=0;d<dir.length;d++)
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
    public int paths_dp(int SR,int SC,int ER, int EC, int[][]dir, int [][]dp)
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
       
                 for(int d=0;d<dir.length;d++)
             
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
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        int [][] dir = {{1,0},{0,1}};
        //int ans = paths(0,0,m-1,n-1,dir,dp);
        int ans = paths_dp(0,0,m-1,n-1,dir,dp);
        return ans;
        
    }
}
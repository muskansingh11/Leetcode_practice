class Solution {
    
    
    public void dfs(int i,int j,int[][] dir,char [][]arr)
    {
        arr[i][j] = '0';
        for(int d = 0;d<4;d++)
        {
            int r = i + dir[d][0];
            int c = j + dir[d][1];
        
            if(r>=0 && c>=0 && r<arr.length && c<arr[0].length && arr[r][c] =='1')
            {
                dfs(r,c,dir,arr);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        int [][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == '1')
                {
                    dfs(i,j,dir,grid);
                    count++;
                }
            }
        }
        return count;
        
        
    }
}
class Solution {
    public int diagonalSum(int[][] mat) {

        int sum_of_diagonal_elements = 0;
        for(int row =0;row<mat.length;row++)
        {
            for(int col=0;col<mat.length;col++)
            {
                if(row==col || row+col==mat.length-1)
                {
                    
                    sum_of_diagonal_elements+=mat[row][col];
                }
            }
        }
       return sum_of_diagonal_elements;
        

  
    }
}
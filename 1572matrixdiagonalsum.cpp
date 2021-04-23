class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int sum_of_diagonal_elements = 0;
        for(int row =0;row<mat.size();row++)
        {
            for(int col=0;col<mat.size();col++)
            {
                if(row==col || row+col==mat.size()-1)
                {
                    
                    sum_of_diagonal_elements+=mat[row][col];
                }
            }
        }
       return sum_of_diagonal_elements;
        
    }
};
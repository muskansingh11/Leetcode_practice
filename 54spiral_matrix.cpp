class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
      
        int row = matrix.size();
        int col = matrix[0].size();
        int total_elements = row*col;
        int min_row = 0;
        int min_col = 0;
        int max_row = matrix.size()- 1;
        int max_col = matrix[0].size() - 1;
        vector<int>answer;
        while(total_elements >0)
        {
            for(int j=min_col;j<=max_col && total_elements>0;j++)
            {
                answer.push_back(matrix[min_row][j]);
              
                total_elements--;
            }
              min_row++;
            for(int i=min_row;i<=max_row && total_elements>0;i++)
            {
                answer.push_back(matrix[i][max_col]);
              
                total_elements--;
            }
              max_col--;
            for(int j=max_col;j>=min_col && total_elements>0;j--)
            {
                answer.push_back(matrix[max_row][j]);
               
                total_elements--;
            }
             max_row--;
            for(int i=max_row;i>=min_row && total_elements>0 ;i--)
            {
                answer.push_back(matrix[i][min_col]);
               
                total_elements--;
            }
             min_col++;
        }
        return answer;
     
    }
};
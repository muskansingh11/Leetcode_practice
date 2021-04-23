class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      
        
      
        int row = matrix.length;
        int col = matrix[0].length;
        int total_elements = row*col;
        int min_row = 0;
        int min_col = 0;
        int max_row = matrix.length- 1;
        int max_col = matrix[0].length - 1;
        List<Integer> answer = new ArrayList<Integer>();
        while(total_elements >0)
        {
            for(int j=min_col;j<=max_col && total_elements>0;j++)
            {
                answer.add(matrix[min_row][j]);
              
                total_elements--;
            }
              min_row++;
            for(int i=min_row;i<=max_row && total_elements>0;i++)
            {
                answer.add(matrix[i][max_col]);
              
                total_elements--;
            }
              max_col--;
            for(int j=max_col;j>=min_col && total_elements>0;j--)
            {
                answer.add(matrix[max_row][j]);
               
                total_elements--;
            }
             max_row--;
            for(int i=max_row;i>=min_row && total_elements>0 ;i--)
            {
                answer.add(matrix[i][min_col]);
               
                total_elements--;
            }
             min_col++;
        }
        return answer;
     

        
    }
}
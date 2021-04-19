class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>>ans;
        for(int n = 0;n<numRows;n++)
        {
            int val = 1;
            vector<int>arr;
            for(int r = 0;r<=n;r++)
            {
                arr.push_back(val);
                val = ((n-r)*val)/ (r + 1);
            }
            ans.push_back(arr);
        }
        return ans;
        
    }
};
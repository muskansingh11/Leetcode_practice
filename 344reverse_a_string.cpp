class Solution {
public:
    void reverseString(vector<char>& s) {
    
        int i = 0;
        int m = s.size()-1;
        while(i<=m)
        {
            char c = s[i];
            s[i] = s[m];
            s[m] = c;
            i++;
            m--;
        }
    }

};
class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int m = s.length-1;
        while(i<=m)
        {
            char c = s[i];
            s[i] = s[m];
            s[m] = c;
            i++;
            m--;
        }
    }
}
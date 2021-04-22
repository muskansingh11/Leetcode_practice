class Solution {
    public void rotate(int[] nums, int k) {
      int n = nums.length;
      k = (k%n + n)%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
      
        
    }
    public void reverse(int []arr, int s, int e)
    {
        while(s<=e)
        {
            int temp = arr[s];
            arr[s]= arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
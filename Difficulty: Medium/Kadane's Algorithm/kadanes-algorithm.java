class Solution 
{
    int maxSubarraySum(int[] arr) 
    {
        int n = arr.length;
        int mx = arr[0];
        int ans = arr[0];
        for(int i = 1; i < n; i++)
        {
             mx = Math.max(arr[i], mx + arr[i]);
            ans = Math.max(ans, mx);
        }
        return ans;
    }
}
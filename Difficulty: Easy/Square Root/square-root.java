class Solution 
{
    int floorSqrt(int n) 
    {
         int low = 1, high = n;
         int ans = -1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            long sq = (long)mid * mid;
            if(sq == n)
            {
                return mid;
            }
            else if(sq < n)
            {
                ans = mid;
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return ans;
    }
}
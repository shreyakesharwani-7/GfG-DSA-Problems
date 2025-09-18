class Solution 
{
    public int searchInsertK(int arr[], int k) 
    {
        int low = 0, high = arr.length - 1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if(arr[mid] == k)
            {
                return mid;
            }
            else if(arr[mid] > k)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
            return low;       
    }
}
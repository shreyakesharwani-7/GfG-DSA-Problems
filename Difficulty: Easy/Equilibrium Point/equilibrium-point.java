class Solution 
{
    public static int findEquilibrium(int arr[]) 
    {
         int n = arr.length;
         int lSum = 0, tSum = 0;
         for(int i = 0; i < n; i++)
         {
             tSum += arr[i];
         }
         for(int i = 0; i < n; i++)
         {
             int rSum = tSum - lSum - arr[i];
             if(lSum == rSum)
             {
                 return i;
             }
             else
             {
                 lSum += arr[i];
             }
         }
         return -1;
    }
}

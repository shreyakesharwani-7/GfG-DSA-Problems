// User function Template for Java

class Solution 
{
    public int findMaximum(int[] arr) 
    {
        // code here
         	int n = arr.length;
       int low = 0, high = n - 1;    
        int res = n - 1;                  
        
        while (low <= high) 
        {
            int mid = (low + high) / 2; 
             if (mid + 1 < n && arr[mid] > arr[mid + 1]) 
             {
                res = mid;            
                high = mid - 1;  
            }
            else 
            {
                low = mid + 1;       
            }
        }
        
        return arr[res];              
    }
}

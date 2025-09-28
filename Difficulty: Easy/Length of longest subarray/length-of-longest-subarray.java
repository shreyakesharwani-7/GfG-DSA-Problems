// User function Template for Java

class Solution {
    public int longestSubarray(int arr[]) {
        // write code here
        int n = arr.length;
        int maxL = 0, maxS = 0, currL = 0, currS = 0;
        for(int i=0; i < n; i++)
        {
            if(arr[i] >= 0)
            {
                currL++;
                currS += arr[i];
                if(currL > maxL)
                {
                    maxL = currL ;
                    maxS = currS;
                }
            }
            else
            {
                currL = 0;
                currS = 0;
            }
        }
        return maxL;
        
    }
}
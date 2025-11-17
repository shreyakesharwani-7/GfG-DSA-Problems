// User function Template for Java

class Solution 
{
    public int findSubString(String str) 
    {
        // code here
        int n = str.length();
        boolean[]pre = new boolean[256];
        int count = 0;
        for(int i =0; i < n; i++)
        {
            if(!pre[str.charAt(i)])
            {
                pre[str.charAt(i)] = true;
                count++;
            }
        }
        int [] freq = new int[256];
        int c = 0, l = 0;
        int minLen = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            char ch = str.charAt(i);
            freq[ch]++;
            if(freq[ch] == 1)
            {
                c++;
            }
            if(c == count)
            {
                while(freq[str.charAt(l)] > 1)
                {
                    freq[str.charAt(l)]--;
                    l++;
                }
                minLen = Math.min(minLen, i - l + 1);
            }
        }
        return minLen;
    }
}
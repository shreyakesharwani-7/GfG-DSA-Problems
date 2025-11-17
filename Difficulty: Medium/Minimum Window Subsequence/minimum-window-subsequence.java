class Solution 
{
    public String minWindow(String s1, String s2) 
    {
        int n = s1.length(), m = s2.length();
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        int i = 0;
        while (i < n) 
        {
            int j = 0;
            while (i < n) 
            {
                if (s1.charAt(i) == s2.charAt(j)) 
                {
                    j++;
                }
                if (j == m) break;
                i++;
            }

            if (i == n) break;  
            int end = i; 
            j = m - 1;

            while (i >= 0) 
            {
                if (s1.charAt(i) == s2.charAt(j)) 
                {
                    j--;
                }
                if (j < 0) break;
                i--;
            }

            int start = i;

             if (end - start + 1 < minLen) 
            {
                minLen = end - start + 1;
                startIndex = start;
            }
    i = start + 1;
        }

        return startIndex == -1 ? "" : s1.substring(startIndex, startIndex + minLen);
    }
}

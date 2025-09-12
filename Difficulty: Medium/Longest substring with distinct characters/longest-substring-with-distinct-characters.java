class Solution 
{
    public int longestUniqueSubstr(String s) 
    {
        HashMap<Character,Integer> mp = new HashMap<>();
        int n = s.length();
        int left = 0;
        int maxLen = 0;
        for(int r = 0; r < n; r++)
        {
            char ch = s.charAt(r);
            if(mp.containsKey(ch))
            {
                if(mp.get(ch) >= left)
                {
                    left = mp.get(ch) + 1;
                }
            }
            mp.put(ch, r);
            int len = r - left + 1;
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}
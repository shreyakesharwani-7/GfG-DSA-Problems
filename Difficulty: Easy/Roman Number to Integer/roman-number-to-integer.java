class Solution {
    public int romanToDecimal(String s) {
        // code here
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        HashMap<String, Integer> map = new HashMap<>();
        int n = values.length;
        for (int i = 0; i < n; i++) 
        {
            map.put(symbols[i], values[i]);
        }

        int i = 0, ans = 0;
        while (i < s.length()) 
        {
            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) 
            {
                ans += map.get(s.substring(i, i + 2));
                i += 2;
            } 
            else 
            {
                ans += map.get(s.substring(i, i + 1));
                i++;
            }
        }
        return ans;
    }
}
class Solution 
{
    static boolean findsum(int arr[]) 
    {
        HashMap <Integer, Integer> mp = new HashMap<>();
        int sum = 0, count = 0;
        mp.put(0, 1);
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
            int c = sum - 0;
            if(mp.containsKey(c))
            {
                count += mp.get(c);
                return true;
            }
            
                mp.put(sum, mp.getOrDefault(sum, 0) + 1);
                
        }
        return false;
    }
}
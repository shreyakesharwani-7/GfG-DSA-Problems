// User function Template for Java

class Solution {
    // Function to count the number of subarrays with a sum that is divisible by K
    public int subCount(int[] arr, int k) {
            // code here
    long sum = 0;
    int count = 0;
    HashMap<Integer, Integer> mp = new HashMap<>();
    mp.put(0, 1);
    
    for (int i = 0; i < arr.length; i++) 
    {
        sum += arr[i]; 
        int c = (int)(((sum % k) + k) % k); 
        if (mp.containsKey(c)) 
        {
            count += mp.get(c);
        }
        mp.put(c, mp.getOrDefault(c, 0) + 1);
    }
    return count;

    }
}

class Solution {
    public int missingNumber(int[] arr) {
        // code here
        HashSet<Integer> s = new HashSet<>();
        for(int n : arr) 
        {
            s.add(n);
        }
        for(int i = 1; i <= arr.length + 1; i++) 
        {
            if(!s.contains(i)) 
            {
                return i;
            }
        }
        return 1; 
    }
}

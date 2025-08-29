// User function Template for Java

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < arr.length; i++)
        {
            int a = target - arr[i];
            if(h.contains(a))
                return true;
            h.add(arr[i]);

        }
        return false;
        
    }
}
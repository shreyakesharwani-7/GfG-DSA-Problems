import java.util.*;

class Solution 
{
    int majorityElement(int arr[]) 
    {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : arr) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();  
            }
        }
        return -1;
    }
}

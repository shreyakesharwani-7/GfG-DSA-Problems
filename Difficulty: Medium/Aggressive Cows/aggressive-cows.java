import java.util.*;

class Solution {
    boolean check(int mid, int[] stalls, int k) {
        int count = 1; 
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= mid) {
                count++;
                lastPos = stalls[i];
            }
            if (count >= k) return true; 
        }
        return false;
    }

    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int s = 1, e = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (check(mid, stalls, k)) {
                ans = mid;
                s = mid + 1; 
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}

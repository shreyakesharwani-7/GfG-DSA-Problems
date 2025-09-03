class Solution {
    boolean check(int mid, int[] arr, int k) {
        int sum = 0, students = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                return false; 
            }
            if (sum + arr[i] > mid) {
                 students++;
                sum = arr[i];
                if (students > k) {
                    return false;
                }
            } else {
                sum += arr[i];
            }
        }
        return true;
    }

    public int findPages(int[] arr, int k) {
        if (arr.length < k) {
            return -1;
        }

        int start = 0, end = 0, ans = -1;
        for (int i = 0; i < arr.length; i++) {
            end += arr[i];
            start = Math.max(start, arr[i]); // minimum limit
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            if (check(mid, arr, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}

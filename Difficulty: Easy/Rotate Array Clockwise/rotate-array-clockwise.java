class Solution {
    public void rotateclockwise(int[] arr, int k) {
        // code here
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1); 
        reverse(arr, 0, k - 1); 
        reverse(arr, k, n - 1);
        
    }
    void reverse(int [] arr, int s, int e)
    {
        while(s < e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
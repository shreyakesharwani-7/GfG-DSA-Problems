class Solution {
    static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        int[][] dp = new int[n][sum+1];
        
        for(int[] row : dp)
            Arrays.fill(row, -1);
            
        return target(arr, n-1, dp, sum);
    }
    public static boolean target(int[] arr, int i, int[][] dp, int sum){
        if(sum == 0) 
            return true;
        if(i < 0) 
            return false;
        
        if(dp[i][sum] != -1)
            return dp[i][sum] == 1;
        
        boolean pick = false;
        if(arr[i] <= sum)
            pick = target(arr, i-1, dp, sum - arr[i]);
        
        boolean npick = target(arr, i-1, dp, sum);
        
        dp[i][sum] = (pick || npick) ? 1 : 0;
        
        return pick || npick;
    }
}
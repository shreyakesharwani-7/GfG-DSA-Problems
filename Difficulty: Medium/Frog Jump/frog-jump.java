class Solution {
    int minCost(int[] height) {
        // code here
        int n=height.length;
        int[]dp=new int[n+1];
        for(int i=0;i<n;i++){
            dp[i]=-1;
        }
        return solve(height,dp,n-1);
    }
    public int solve(int[]arr, int[]dp, int i){
        if(i==0)
            return 0;
        if(i==1)
            return Math.abs(arr[i]-arr[i-1]);
        if(dp[i]!=-1)
            return dp[i];
        int ans1=Math.abs(arr[i]-arr[i-1])+solve(arr,dp,i-1);
        int ans2=Math.abs(arr[i]-arr[i-2])+solve(arr,dp,i-2);
        dp[i]=Math.min(ans1,ans2);
        return dp[i];
    }
}
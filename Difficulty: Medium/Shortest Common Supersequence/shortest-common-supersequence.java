
class Solution {
    public int minSuperSeq(String s1, String s2) {
        int n=s1.length(), m=s2.length();
        int n1=n-lcs(s1,s2);
        int n2=m-lcs(s1,s2);
        int ans = n1+n2+lcs(s1,s2);
        
        return ans;
        
    }
    public int lcs(String s1, String s2){
        int n=s1.length(), m=s2.length();
        int[][]dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                     dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
                return dp[n][m];

    }
    
}
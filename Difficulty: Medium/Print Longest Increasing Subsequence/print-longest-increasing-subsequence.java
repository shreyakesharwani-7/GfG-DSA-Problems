class Solution {
    public ArrayList<Integer> getLIS(int arr[]) {
        // Code here
        int n=arr.length;
        int[] lis=new int[n];
        int[] hash =new int[n];
        for(int i=0;i<n;i++){
            lis[i]=1;
            hash[i]=i;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]&& lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                    hash[i]=j;
                }
            }
        }
        int maxLen=lis[0];
        int idx=0;
        for(int i=1;i<n;i++){
            if(lis[i]>maxLen){
                maxLen=lis[i];
                idx=i;
            }
        }
        ArrayList<Integer> ans =new ArrayList<>();
        while(hash[idx]!=idx){
            ans.add(arr[idx]);
            idx=hash[idx];
        }
            ans.add(arr[idx]);
            Collections.reverse(ans);
            return ans;
    }
}

class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        int n =arr.length;
        ArrayList<Integer> prefix = new ArrayList<>();
        if(n==0)
        {
            return prefix;
        }
        prefix.add(arr[0]);
        for(int i =1;i <n;i++){
            prefix.add(prefix.get(i-1)+arr[i]);
        }
        return prefix;
    }
}
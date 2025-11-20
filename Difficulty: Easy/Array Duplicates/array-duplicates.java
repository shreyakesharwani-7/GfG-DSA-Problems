class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Set<Integer> s = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int n : arr)
        {
            if(!s.contains(n))
            {
                s.add(n);
            }
            else
            {
                res.add(n);
            }
        }
        return res;
    }
}
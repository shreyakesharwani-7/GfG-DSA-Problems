class Solution 
{
    public ArrayList<Integer> intersect(int[] a, int[] b) 
    {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        ArrayList<Integer> l = new ArrayList<>();
        
        while(i < a.length && j < b.length)
        {
            if(a[i] == b[j])
            {
                  if(l.isEmpty() || l.get(l.size()-1) != a[i])
                {
                    l.add(a[i]);
                }
                i++;
                j++;
            }
            else if(a[i] < b[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        return l;
    }
}

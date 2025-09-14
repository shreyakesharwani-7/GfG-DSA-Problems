class Solution 
{
    public static String reverseString(String s) 
    {
        char [] ch = s.toCharArray();
        int l = 0, e = ch.length - 1;
        while(l < e)
        {
            char temp = ch[l];
            ch[l] = ch[e];
            ch[e] = temp;
            l++;
            e--;
        }
        return new String(ch);
    }
}
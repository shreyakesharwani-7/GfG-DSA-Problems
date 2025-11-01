/*
class Node 
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution 
{
    public ArrayList<Integer> inOrder(Node root) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while (curr != null || !st.isEmpty()) 
        {
            while (curr != null) 
            {
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            res.add(curr.data);
            curr = curr.right;
        }

        return res;
    }
}



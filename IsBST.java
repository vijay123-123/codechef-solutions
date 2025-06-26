class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        return checkBST(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
    }
    
    boolean checkBST(Node node,int max,int min)
    {
        if(node == null) return true;
        
        if(node.data <= min || node.data >= max) return false;
        
        return (checkBST(node.left,node.data,min) && checkBST(node.right,max,node.data));
    }
}
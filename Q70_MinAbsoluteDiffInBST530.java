// link to the question --> https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/

class Solution {
    Integer prev;
    int res = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        prev = null;
        inOrder(root);
        return res;
    }

    public void inOrder(TreeNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        if(prev !=null){
            res = Math.min(res, node.val - prev);
        }
        prev = node.val;
        inOrder(node.right);
    }
}
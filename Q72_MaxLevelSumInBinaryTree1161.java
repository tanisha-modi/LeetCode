// link to the question --> https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/

class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int maxSum = root.val;
        int ans = 1;
        int level = 1;

        while(!q.isEmpty()){
            int levelSize = q.size();
            int levelSum = 0;

            for(int i = 0; i < levelSize; i++){
                TreeNode removed = q.remove();
                levelSum += removed.val;
                if(removed.left!=null){
                    q.add(removed.left);
                }
                if(removed.right!=null){
                    q.add(removed.right);
                }
            }
            if(levelSum > maxSum){
                maxSum = levelSum;
                ans = level;
            }
            level++;
        }
        return ans;
    }
}
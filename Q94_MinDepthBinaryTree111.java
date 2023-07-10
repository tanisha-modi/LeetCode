// link to the question --> https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left == null && node.right == null)
                    return depth;

                if (node.left != null)
                    queue.offer(node.left);

                if (node.right != null)
                    queue.offer(node.right);
            }
        }

        return 0; // In case the tree is empty
    }
}
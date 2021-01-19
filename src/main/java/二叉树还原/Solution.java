package 二叉树还原;

public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        return reConstructTree(pre, 0, pre.length - 1, in, 0, in.length - 1);

    }

    private TreeNode reConstructTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {

        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == pre[preStart]) {
                root.left = reConstructTree(pre, preStart + 1, i - inStart + preStart, in, inStart, i - 1);
                root.right = reConstructTree(pre, i - inStart + preStart + 1, preEnd, in, i + 1, inEnd);
            }
        }
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}

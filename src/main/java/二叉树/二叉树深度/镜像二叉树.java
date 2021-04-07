package 二叉树.二叉树深度;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class 镜像二叉树 {
    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

        System.out.println( isSymmetrical(treeNode));
    }

    public static boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null){
            return true;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot.left);
        queue.offer(pRoot.right);

        while (!queue.isEmpty()){

            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null)continue;
            if (left == null || right == null)return false;
            if (left.val != right.val) return false;

            //成对插入
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }
        return true;
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}

package 二叉树.是否平衡二叉树;

import 二叉树.二叉树还原.Solution;

public class 递归 {


    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null){
            return true;
        }
        return abs(treeDepth(root.left), treeDepth(root.right)) <= 1;
    }

    int treeDepth(TreeNode node){
        if (node == null){
            return 0;
        }
        int lCount = treeDepth(node.left);
        int rCount = treeDepth(node.right);
        return max(lCount,rCount) + 1;
    }
    int max(int a,int b){
        return a>b ? a : b;
    }
    int abs(int a,int b){
        if (a > b){
            return a-b;
        }
        return b-a;
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

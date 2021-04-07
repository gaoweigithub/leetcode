package 二叉树.中序;


import java.sql.Statement;
import java.util.Stack;

public class 循环中序2 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(6);
        TreeNode treeNode6 = new TreeNode(8);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;

        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;

        System.out.println("k min :"  + zhongxu(treeNode,3));
    }

    static TreeNode zhongxu(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        int counter = 0;
        while (p != null || !stack.isEmpty()){
            if (p != null){
                stack.push(p);
                p = p.left;
            }else{
                p = stack.pop();
                System.out.println(p);
                if (++counter == k){
                    return p;
                }
                p = p.right;
            }
        }
        return null;
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    '}';
        }
    }
}

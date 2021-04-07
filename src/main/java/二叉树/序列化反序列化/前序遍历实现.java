package 二叉树.序列化反序列化;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 前序遍历实现 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(8);
        TreeNode treeNode1 = new TreeNode(6);
        TreeNode treeNode2 = new TreeNode(10);
        TreeNode treeNode3 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(7);
        TreeNode treeNode5 = new TreeNode(9);
        TreeNode treeNode6 = new TreeNode(11);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;

        treeNode2.left = treeNode5;
        treeNode2.right = treeNode6;

        System.out.println(Serialize(treeNode));

        System.out.println(Deserialize(Serialize(treeNode)));
    }

    static String Serialize(TreeNode root) {
        if (root == null) {
            return "#";
        } else {
            return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);
        }
    }

    static TreeNode Deserialize(String str) {
        String[] s = str.split(",");//将序列化之后的序列用，分隔符转化为数组
        Queue<String> queue = new LinkedList<>();
        for (String s1 : s) {
            queue.offer(s1);
        }
        return deser(queue);
    }
    static TreeNode deser(Queue<String> q){
        if (q.isEmpty()){
            return null;
        }
        TreeNode node = null;
        String tmp = q.poll();
        if (!tmp.equals("#")){
            node = new TreeNode(Integer.parseInt(tmp));
            node.left = deser(q);
            node.right = deser(q);
        }
        return node;
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
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}

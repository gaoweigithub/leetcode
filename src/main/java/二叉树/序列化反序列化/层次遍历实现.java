package 二叉树.序列化反序列化;

import java.util.LinkedList;
import java.util.Queue;

public class 层次遍历实现 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(5);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

        System.out.println(Serialize(treeNode));

        System.out.println(Deserialize("1,2,3,#,#,4,5"));
    }

    static String Serialize(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (null == node) {
                sb.append("#,");
            } else {
                sb.append(node.val).append(",");
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return sb.substring(0,sb.length() - 1);
    }

    static TreeNode Deserialize(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String[] strs = str.split(",");

        Queue<String> sq = new LinkedList<>();
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();

        for (String d : strs) {
            sq.offer(d);
        }
        String ch = sq.poll();
        if (ch.equals("#") ) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(ch));
        treeNodeQueue.offer(root);
        while (!sq.isEmpty() && !treeNodeQueue.isEmpty()) {

            TreeNode tmp = treeNodeQueue.poll();
            String leftchar = sq.poll();
            if (leftchar.equals("#")) {
                tmp.left = null;
            } else {
                TreeNode left = new TreeNode(Integer.parseInt(leftchar));
                treeNodeQueue.offer(left);
                tmp.left = left;
            }

            if (!sq.isEmpty()) {
                String rightchar = sq.poll();
                if (rightchar.equals("#") ) {
                    tmp.right = null;
                } else {
                    TreeNode right = new TreeNode(Integer.parseInt(rightchar));
                    treeNodeQueue.offer(right);
                    tmp.right = right;
                }
            }
        }
        return root;
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

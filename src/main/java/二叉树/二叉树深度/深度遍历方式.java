package 二叉树.二叉树深度;

public class 深度遍历方式 {
    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

        System.out.println(TreeDepth(treeNode));
    }

    public static int TreeDepth(TreeNode root) {

        if (root == null){
            return 0;
        }

        int[] maxFloor = new int[]{0};

        DFS(root,0,maxFloor);

        return maxFloor[0];
    }
    static void  DFS(TreeNode node, int floor, int[] maxFloor){
        if (node == null){
            return;
        }
        if (node.left == null && node.right == null){
            floor ++;
            if (floor > maxFloor[0]){
                maxFloor[0] = floor;
            }
        }
        if (node.left != null){
            DFS(node.left,floor + 1,maxFloor);
        }
        if (node.right != null){
            DFS(node.right,floor,maxFloor);
        }
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

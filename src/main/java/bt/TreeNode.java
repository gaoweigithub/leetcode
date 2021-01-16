package bt;

public class TreeNode {
    String name;
    TreeNode left;
    TreeNode right;

    public void print(){
        System.out.print(name);
    }

    public TreeNode(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "name='" + name + '\'' +
                '}';
    }
}

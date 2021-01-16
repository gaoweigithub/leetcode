package bt;

public class TreeNodeGenerator {

    public static  TreeNode genF1Tree(){
        TreeNode A = new TreeNode("A");
        TreeNode B = new TreeNode("B");
        TreeNode C = new TreeNode("C");
        TreeNode D = new TreeNode("D");
        TreeNode E = new TreeNode("E");
        TreeNode F = new TreeNode("F");
        TreeNode G = new TreeNode("G");
        TreeNode H = new TreeNode("H");
        TreeNode I = new TreeNode("I");
        TreeNode J = new TreeNode("J");
        TreeNode K = new TreeNode("K");

        A.setLeft(B);
        A.setRight(C);

        B.setLeft(D);
        B.setRight(E);

        C.setLeft(F);
        C.setRight(G);

        D.setRight(H);

        E.setRight(I);

        F.setLeft(J);
        F.setRight(K);

        return A;
    }
}

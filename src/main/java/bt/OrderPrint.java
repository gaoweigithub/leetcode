package bt;

import java.util.Stack;

public class OrderPrint {
    public static void main(String[] args) {

        preOrder1(TreeNodeGenerator.genF1Tree());
        System.out.println("");
        preOrder2(TreeNodeGenerator.genF1Tree());
        System.out.println("");

        midOrder1(TreeNodeGenerator.genF1Tree());
        System.out.println("");
        midOrder2(TreeNodeGenerator.genF1Tree());
        System.out.println("");

        postOrder1(TreeNodeGenerator.genF1Tree());
        System.out.println("");
        postOrder2(TreeNodeGenerator.genF1Tree());
        System.out.println("");

    }

    /**
     * 前序遍历 -- 递归算法
     * @param tree
     */
    static void preOrder1(TreeNode tree){
        if (null == tree){
            return;
        }

        tree.print();

        if (null != tree.left){
            preOrder1(tree.left);
        }

        if (null != tree.right){
            preOrder1(tree.right);
        }
    }

    /**
     * 前序遍历 -- 非递归实现
     * @param tree
     */
    static void preOrder2(TreeNode tree){
        if (null == tree){
            return;
        }

        TreeNode p = tree;
        Stack<TreeNode> stack = new Stack<>();

        while (null != p){

            p.print();

            if (null != p.left){
                stack.push(p.right);
                p = p.left;
            }else if (null != p.right){
                p = p.right;
            }else {
                if (stack.size() > 0){
                    p = stack.pop();
                }else {
                    p = null;
                }
            }
        }

    }

    /**
     * 中序遍历 -- 递归算法
     * @param tree
     */
    static void midOrder1(TreeNode tree){
        if (null == tree){
            return;
        }

        if (null != tree.left){
            midOrder1(tree.left);
        }

        tree.print();

        if (null != tree.right){
            midOrder1(tree.right);
        }
    }

    /**
     * 中序遍历 -- 非递归实现
     * @param tree
     */
    static void midOrder2(TreeNode tree){
        if (null == tree){
            return;
        }

        TreeNode p = tree;
        Stack<TreeNode> stack = new Stack<>();

        while (null != p || !stack.isEmpty()){

            while (null != p){
                stack.push(p);
                p = p.left;
            }

            while (!stack.isEmpty()){
                p = stack.pop();
                p.print();
                p = p.right;
                break;
            }
        }
    }

    /**
     *后序遍历 -- 递归算法
     * @param tree
     */
    static void postOrder1(TreeNode tree){
        if (null == tree){
            return;
        }

        if (null != tree.left){
            postOrder1(tree.left);
        }

        if (null != tree.right){
            postOrder1(tree.right);
        }

        tree.print();
    }
    public String replaceSpace(StringBuffer str) {
        char[] chars = str.toString().toCharArray();
        for(int i = 0; i<chars.length ; i++){
            if(chars[i] == ' '){
                str.append(chars[i]);
            }else{
                str.append("%20");
            }
        }
        return str.toString();
    }
    /**
     * 后序遍历 -- 非递归实现
     * @param tree
     */
    static void postOrder2(TreeNode tree){
        if (null == tree){
            return;
        }

        TreeNode pre = tree;
        TreeNode cur = tree;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(cur);

        while (stack.size() > 0){
            cur = stack.peek();
            if ((null == cur.left && null == cur.right) || ((pre == cur.right || pre == cur.left) && pre != cur)){
                cur.print();
                pre = stack.pop();
            }else{
                if (null != cur.right){
                    stack.push(cur.right);
                }
                if (null != cur.left){
                    stack.push(cur.left);
                }
            }
        }
    }
}

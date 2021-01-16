import java.util.Stack;

public class ReversePrintLink {
    public static void main(String[] args) {
        Node root = new Node("root");

        Node c1 = new Node("1");
        Node c2 = new Node("2");
        Node c3 = new Node("3");
        Node c4 = new Node("4");
        Node c5 = new Node("5");
        Node c6 = new Node("6");
        Node c7 = new Node("7");
        Node c8 = new Node("8");
        Node c9 = new Node("9");
        Node c10 = new Node("10");

        root.next = c1;
        c1.next = c2;
        c2.next = c3;
        c3.next = c4;
        c4.next = c5;
        c5.next = c6;
        c6.next = c7;
        c7.next = c8;
        c8.next = c9;
        c9.next = c10;

        Node p = root;
        Stack<Node> stack = new Stack<>();
        while (null != p){
            stack.push(p);
            p = p.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop().name);
        }

//        print(root);
    }
    static void print(Node node){
        if (null != node.next){
            print(node.next);
        }
        System.out.println(node.name);
    }

    static class Node{
        Node next;
        String name;
        public Node( String name){
            this.name = name;
        }
    }
}

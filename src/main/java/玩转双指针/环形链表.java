package 玩转双指针;

public class 环形链表 {

    public static void main(String[] args) {
        环形链表 dd = new 环形链表();

//        ListNode root = new ListNode(3);
//        root.next = new ListNode(2);
//        root.next.next = new ListNode(0);
//        root.next.next.next = new ListNode(-4);
//        root.next.next.next.next = root.next;

        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = root;

        System.out.println(dd.detectCycle(root));
    }

    public ListNode detectCycle(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode fir = head;

        ListNode sec = head;
        do{
            if (null == fir || fir.next == null){
                //no data
                return null;
            }
            fir = fir.next.next;

            sec = sec.next;
        }while (fir != sec);
        //exist circle
        fir = head;
        while (fir != sec){
            fir = fir.next;
            sec = sec.next;
        }
        return fir;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }
    }

}

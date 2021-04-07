package 链表;

import java.util.HashSet;
import java.util.Set;

public class 第一个公共节点双指针 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null){
            return null;
        }

        ListNode p1 = pHead1;
        ListNode p2 = pHead2;

        while (p1 != p2){
            p1 = p1 == null ? pHead2 : p1.next;
            p1 = p2 == null ? pHead1 : p2.next;
        }
        return p1;

    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}

package 链表;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 第一个公共节点 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null){
            return null;
        }

        Set<ListNode> set = new HashSet<>();
        ListNode p1 = pHead1;
        while (p1 != null){
            set.add(p1);
            p1 = p1.next;
        }

        p1 = pHead2;
        while (p1 != null){
            if (set.contains(p1)){
                return p1;
            }
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

}

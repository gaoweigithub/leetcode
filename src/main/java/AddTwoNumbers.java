/**
 * @(#)AddTwoNumbers.java Created by gw33973 on 2018/4/25   21:16
 * <p>
 * Copyrights (C) 2018保留所有权利
 */

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:                                 <br>
 * 修改日期           修改人员       版本       修改内容<br>
 * -------------------------------------------------<br>
 * 2018/4/25 21:16   gw33973     1.0       初始化创建<br>
 * </p>
 *
 * @author gw33973
 * @version 1.0
 * @since JDK1.7
 */
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1length = 0;
        int l2length = 0;
        ListNode l1cursor = l1;
        ListNode l2cursor = l2;
        do {
            l1length++;
            l1cursor = l1cursor.next;
        }
        while (l1cursor != null);
        do {
            l2length++;
            l2cursor = l2cursor.next;
        }
        while (l2cursor != null);

        char[] chars1 = new char[l1length];
        char[] chars2 = new char[l2length];
        l1cursor = l1;
        l2cursor = l2;
        int i1 = l1length;
        int i2 = l2length;
        do {
            chars1[l1length - i1--] = (char) (l1cursor.val + 48);
            l1cursor = l1cursor.next;
        } while (l1cursor != null);
        do {
            chars2[l2length - i2--] = (char) (l2cursor.val + 48);
            l2cursor = l2cursor.next;
        } while (l2cursor != null);

        //add
        int nl = Math.max(l1length, l2length) + 1;
        char[] rr = new char[nl];
        for (int k = 0; k < rr.length; k++) {
            rr[k] = (char) (48);
        }
        int addmod = 0;
        int es = 0;
        boolean hasv = false;
        for (int i = 0; i < nl; i++) {
            //init
            hasv = false;
            es = 0;
            if (l1length > i) {
                es += (chars1[i] - 48);
            }
            if (l2length > i) {
                es += (chars2[i] - 48);
            }
            int vv = es + addmod;
            rr[i] = (char) (vv - (vv / 10) * 10 + 48);
            addmod = vv / 10;
        }

        ListNode head = new ListNode(-1);
        ListNode cur = head;
        int sl = rr.length;
        for (int j = rr.length; j > 1; j--) {
            if (rr[j - 1] == 48) {
                sl = j - 1;
            } else {
                break;
            }
        }


        for (int j = 0; j < sl; j++) {
            cur.next = new ListNode(rr[j] - 48);
            cur = cur.next;
        }
//        while (head.val == 0) {
//            head = head.next;
//        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);


        ListNode r = addTwoNumbers(l1, l2);
        ListNode cur = r;
        while (cur != null) {
            System.out.println(String.valueOf(cur.val));
            cur = cur.next;
        }
    }
}

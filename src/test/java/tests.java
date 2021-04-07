/**
 * @(#)tests.java Created by gw33973 on 2018/4/25   23:16
 * <p>
 * Copyrights (C) 2018保留所有权利
 */

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.notification.RunListener;

import java.util.PriorityQueue;

/**
 * (类型功能说明描述)
 *
 * <p>
 * 修改历史:                                 <br>
 * 修改日期           修改人员       版本       修改内容<br>
 * -------------------------------------------------<br>
 * 2018/4/25 23:16   gw33973     1.0       初始化创建<br>
 * </p>
 *
 * @author gw33973
 * @version 1.0
 * @since JDK1.7
 */
public class tests {
    @Test
    public void lengthoflongestsubstring() {
//        Assert.assertEquals(new LengthOfLongestSubstring().lengthOfLongestSubstring("abcabcbb"), 3);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(3);
        queue.add(2);

        System.out.println(queue);
        queue.remove(1);
        System.out.println(queue);
        queue.remove(3);
        System.out.println(queue);



    }

    @Test
    public void findMedianSortedArrays() {
        int[] nums1 = new int[]{1, 2, 3, 4, 5};
        int[] nums2 = new int[]{};
        double v = new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
        System.out.println(v);
        Assert.assertEquals(3, v, 0);

//        nums1 = new int[]{1, 2};
//        nums2 = new int[]{3, 4};
//        v = new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
//        Assert.assertEquals(v, 2.5, 0);
//        System.out.println(v);
    }

    @Test
    public void LongestPalindrome() {
        Assert.assertEquals("bcdcb", new LongestPalindrome().longestPalindrome("abcdcbe"));
        Assert.assertEquals("a", new LongestPalindrome().longestPalindrome("a"));
        Assert.assertEquals("a", new LongestPalindrome().longestPalindrome("ab"));
        Assert.assertEquals("abcdefgfedcba", new LongestPalindrome().longestPalindrome("abcdefgfedcba"));
        Assert.assertEquals("", new LongestPalindrome().longestPalindrome(""));
        Assert.assertEquals("bb", new LongestPalindrome().longestPalindrome("bb"));
        Assert.assertEquals("bb", new LongestPalindrome().longestPalindrome("cbbd"));
        Assert.assertEquals("cc", new LongestPalindrome().longestPalindrome("ccd"));
    }
}

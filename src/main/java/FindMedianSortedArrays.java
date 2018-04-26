/**
 * @(#)FindMedianSortedArrays.java Created by gw33973 on 2018/4/26   20:21
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
 * 2018/4/26 20:21   gw33973     1.0       初始化创建<br>
 * </p>
 *
 * @author gw33973
 * @version 1.0
 * @since JDK1.7
 */
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] tmp = new int[(nums1.length + nums2.length) / 2 + 1];
        int k1 = 0, k2 = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (k1 < nums1.length && k2 < nums2.length) {
                if (nums1[k1] > nums2[k2]) {
                    tmp[i] = nums2[k2++];
                } else {
                    tmp[i] = nums1[k1++];
                }
            } else if (k1 < nums1.length) {
                tmp[i] = nums1[k1++];
            } else if (k2 < nums2.length) {
                tmp[i] = nums2[k2++];
            }
        }
        if (tmp.length == 0) {
            return 0.0;
        }
        if (tmp.length == 1) {
            return tmp[0];
        }
        if ((nums1.length + nums2.length) % 2 == 0) {
            return (tmp[tmp.length - 1] + tmp[tmp.length - 2]) / 2.0;
        }
        return tmp[tmp.length - 1];
    }
}

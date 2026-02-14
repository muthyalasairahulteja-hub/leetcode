 import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0,nums1.length );
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        int total = nums1.length + nums2.length;
        if (total % 2 == 1) {
            return merged[total / 2];
        } else {
            return (merged[total /2 - 1] + merged[total / 2]) / 2.0;
        }
    }
}




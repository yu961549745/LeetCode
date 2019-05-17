/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个有序数组的中位数
 */
class Solution {
    private static class MergeSortReader {
        private int[] a;
        private int[] b;
        private int pa = 0, pb = 0;

        public MergeSortReader(int[] a, int[] b) {
            this.a = a;
            this.b = b;
        }

        public int next() {
            if (pa >= a.length && pb >= b.length) {
                return -1;
            }
            if (pa >= a.length) {
                return b[pb++];
            }
            if (pb >= b.length) {
                return a[pa++];
            }
            if (a[pa] <= b[pb]) {
                return a[pa++];
            } else {
                return b[pb++];
            }
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        MergeSortReader reader = new MergeSortReader(nums1, nums2);
        int N = nums1.length + nums2.length;
        int a = 0, b = 0, pa, pb;
        if (N % 2 == 0) {
            pa = N / 2 - 1;
            pb = N / 2;
        } else {
            pa = N / 2;
            pb = N / 2;
        }
        for (int k = 0; k <= pb; k++) {
            int v = reader.next();
            if (k == pa) {
                a = v;
            }
            if (k == pb) {
                b = v;
            }
        }
        return (a + b) / 2.0;
    }
}

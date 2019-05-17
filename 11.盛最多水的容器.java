/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */
/**
 * max min(a[i],a[j])*(j-i)
 */
class Solution {
    private int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public int maxArea(int[] height) {
        int n = height.length;
        int m = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int v = min(height[i], height[j]) * (j - i);
                if (v > m) {
                    m = v;
                }
            }
        }
        return m;
    }
}

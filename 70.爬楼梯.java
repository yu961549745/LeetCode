/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */
/**
 * f(n)=f(n-1)+f(n-2)
 * 
 * f(0)=1, f(1)=1
 */
class Solution {
    public int climbStairs(int n) {
        double a = Math.sqrt(5);
        double b = 1.0 / 2 - a / 10;
        double c = Math.pow(1.0 / 2 - a / 2, n);
        double d = 1.0 / 2 + a / 10;
        double e = Math.pow(1.0 / 2 + a / 2, n);
        return (int) Math.round(b * c + d * e);
    }
}

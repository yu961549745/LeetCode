/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */
class Solution {

    public int reverse(int x) {
        boolean neg = x < 0;
        String sign = neg ? "-" : "";
        String num = Integer.toString(x);
        char[] c = neg ? num.substring(1).toCharArray() : num.toCharArray();
        char[] vc = new char[c.length];
        for (int k = 0; k < c.length; k++) {
            vc[k] = c[c.length - 1 - k];
        }
        long y = Long.valueOf(sign + new String(vc));
        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) {
            y = 0;
        }
        return (int) y;
    }
}

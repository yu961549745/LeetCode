import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和 
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer tmp = null;
        for (int k = 0; k < nums.length; k++) {
            if ((tmp = map.get(target - nums[k])) != null) {
                return new int[] { tmp, k };
            }
            map.put(nums[k], k);
        }
        return null;
    }
}

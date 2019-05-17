/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */
class Solution {
    private int getVal(ListNode x) {
        return (x == null) ? 0 : x.val;
    }

    private ListNode getNext(ListNode x) {
        return (x == null) ? null : x.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        int cur = 0, nxt = 0;
        do {
            cur = getVal(l1) + getVal(l2) + nxt;
            // System.out.println(cur%10);
            p.next = new ListNode(cur % 10);
            nxt = cur / 10;
            p = p.next;
            l1 = getNext(l1);
            l2 = getNext(l2);
        } while (!(l1 == null && l2 == null && nxt == 0));
        return head.next;
    }
}

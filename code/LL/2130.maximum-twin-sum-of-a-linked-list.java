/*
 * @lc app=leetcode id=2130 lang=java
 *
 * [2130] Maximum Twin Sum of a Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        if(head == null)
        {
            return 0;
        }
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null)
        {
            list.add(temp);
            temp = temp.next;   
        }
        int max = Integer.  MIN_VALUE;
        for(int i = 0 ; i < list.size() ; i++)
        {
            int sum = list.get(i).val + list.get(list.size() - 1 - i).val;
            max = Math.max(max, sum);
        }
        return max;
    }
}
// @lc code=end


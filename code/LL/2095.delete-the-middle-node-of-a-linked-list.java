/*
 * @lc app=leetcode id=2095 lang=java
 *
 * [2095] Delete the Middle Node of a Linked List
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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null)
        {
            return null;
        }
        // ListNode temp = head;
        // int count = 0;
        // while(temp != null)
        // {
        //     count++;
        //     temp = temp.next;
        // }
        // if(count == 1)
        // {
        //     return null;
        // }
        // int mid = count / 2;
        // temp = head;
        // while(temp != null && mid > 1)
        // {
        //     temp = temp.next;
        //     mid--;
        // }
        // temp.next = temp.next.next;
        // return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev != null)
        {
            prev.next = slow.next;
        }
        else
        {
            head = head.next;
        }
        return head;
    }
}
// @lc code=end


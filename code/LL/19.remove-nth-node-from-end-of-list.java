/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if (head == null) {
        return null;
        }
        int k = 0;
        ListNode curr = head;
        while(curr != null)
        {
            curr = curr.next;
            k++; 
        }
        if(n > k)
        {
            return head;
        }
        if(n == k)
        {
            return head.next;
        }
        if(k - n == 0)
        {
            ListNode temp = head;
            head = head.next;
            return head;
        }
        curr = head;
        for(int i = 1 ; i < k - n ; i++)
        {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;

    }
}
// @lc code=end


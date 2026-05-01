/*
 * @lc app=leetcode id=328 lang=java
 *
 * [328] Odd Even Linked List
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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode temp = head;
        int[] arr = new int[100];
        int count = 0;
        while(temp != null)
        {
            arr[count] = temp.val;
            count++;
            temp = temp.next;
        }
        ListNode newHead = new ListNode(arr[0]);
        ListNode temp1 = newHead;
        for(int i = 1; i < count; i++)
        {
            if(i % 2 == 0)
            {
                temp1.next = new ListNode(arr[i]);
                temp1 = temp1.next;
            }
        }
        for(int i = 1; i < count; i++)
        {
            if(i % 2 != 0)
            {
                temp1.next = new ListNode(arr[i]);
                temp1 = temp1.next;
            }
        }
        return newHead;

       
    }
}
// @lc code=end


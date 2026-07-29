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

        // Step 1: Find the length
        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Step 2: If head needs to be removed
        if (length == n) {
            return head.next;
        }

        // Step 3: Find the previous node
        int position = length - n;
        temp = head;

        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }

        // Step 4: Delete the node
        temp.next = temp.next.next;

        return head;
    }
}
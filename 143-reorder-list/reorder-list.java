class Solution {

    public void reorderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        ListNode curr = head;

        while (curr != null && curr.next != null) {

            curr.next = reverse(curr.next);

            curr = curr.next;
        }
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
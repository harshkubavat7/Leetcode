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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) return head; //If group size is 1, every group contains only one node.
        //Reversing a single node does nothing:

        //dummy node before heAD NODE
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //initialize pointers
        ListNode prevGroup = dummy;
        ListNode end = dummy;

        while(true)
        {
            // Find the end of the k-group
            int count = 0;
            while (count < k && end != null) {
                end = end.next;
                count++;
            }

            if (end == null) break; // not enough nodes to reverse
            // Nodes to be reversed: from start to end
            ListNode start = prevGroup.next;
            ListNode nextGroup = end.next;
            // Disconnect the group
            end.next = null;

            // Reverse the group
            prevGroup.next = reverse(start);

            // Connect reversed group to next group
            start.next = nextGroup;

            // Move prevGroup and end forward
            prevGroup = start;
            end = prevGroup;



        }

        return dummy.next;

    }

    // Helper function to reverse linked list
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

}
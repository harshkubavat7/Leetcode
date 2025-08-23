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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast!=null) //odd node : let right nodes smaller
        {
            slow=slow.next;
        }

        //reverse second half
        slow = reverse(slow);
        fast = head;

        while(slow!=null)
        {
            if(slow.val!=fast.val)
            {
                return false;
            }
            slow = slow.next;
            fast = fast.next;

        }
        return true;
    }

    public ListNode reverse(ListNode head)
    {
        if(head == null)
        {
            return null;
        }
        if(head.next == null)
        {
            return head;
        }

        ListNode preNode = null;
        ListNode currNode = head;
        while(currNode!=null)
        {
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        head = preNode;

        return preNode;
    }
}
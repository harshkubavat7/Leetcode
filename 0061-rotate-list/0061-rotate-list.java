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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;
        int length = 1;
        ListNode tail = head;
        while(tail.next!=null)
        {
            tail = tail.next;
            length++;

        }

        //connect last node with head
        tail.next=head;

        k=k%length;
        int stepToNewHead = length-k;
        ListNode newTail = head;
        for(int i=1;i<stepToNewHead;i++)
        {
            newTail = newTail.next;
        }
        head= newTail.next;
        newTail.next=null;

        return head;
    }
}
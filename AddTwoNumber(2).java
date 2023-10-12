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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        int carry=0;
        while(l1!=null && l2!=null)
        {
            int total = l1.val +l2.val + carry;
            carry = total/10;
            ListNode newNode = new ListNode(total%10);
            temp.next= newNode;
            l1=l1.next;
            l2=l2.next;
            temp = temp.next;
        }
        while(l1!=null)
        {
            int total = l1.val + carry;
            carry = total/10;
            ListNode newNode = new ListNode(total%10);
            temp.next= newNode;
            l1=l1.next;
            temp = temp.next;
        }
        while(l2!=null)
        {
            int total = l2.val + carry;
            carry = total/10;
            ListNode newNode = new ListNode(total%10);
            temp.next= newNode;
            l2=l2.next;
            temp = temp.next;
        }
        if(carry!=0)
            temp.next= new ListNode(carry);
        return head.next;
    }
}

// Time Complexity - O(max(N,M))
// Space Complexity - O(max(N,M))
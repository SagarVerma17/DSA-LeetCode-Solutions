class Solution {

    public ListNode findKthNode(ListNode temp, int k)
    {
        int cnt =1;
        while(temp != null)
        {
            if(cnt == k)
                return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }


    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || k==0)
            return head;

        ListNode temp = head;
        int count = 1;

        while(temp.next != null)
        {
            temp = temp.next;
            count++;
        }

        if(k % count == 0)
            return head;

        k = k % count; 

        temp.next = head;

        ListNode lastNode= findKthNode(head, count-k);
        
        head= lastNode.next;
        lastNode.next = null; 

        return head;
    }
}

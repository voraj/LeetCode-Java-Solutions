//24. Swap Nodes in Pairs

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode temp=curr.next;
        if(temp==null)
        {
            curr.next=prev;
            prev.next=null;
            return curr;
        }
        ListNode back=null;
        
        while (temp!=null){
            back=swapPairs(temp);
            curr.next=prev;
            prev.next=back;
            return curr;
        }
        return curr;
    }
}
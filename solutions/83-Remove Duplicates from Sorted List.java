//83. Remove Duplicates from Sorted List

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev=head;
        ListNode curr=null;
        while(prev!=null){
             curr=prev.next;
            ListNode temp=null;
            while(curr!=null && prev.val==curr.val){
                temp=curr;
                curr=curr.next;
            }
            if(temp!=null){
                temp.next=null;
                prev.next=curr;
            }
            prev=curr;
            
        }
        return head;
    }
}
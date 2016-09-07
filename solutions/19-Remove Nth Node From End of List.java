//19. Remove Nth Node From End of List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode fastPtr=head;
        ListNode slowPtr=head;
        ListNode prev=null;
        if(head.next==null)
            return null;
         int diff=n-1;
         while(diff!=0){
         fastPtr=fastPtr.next;
            diff--;
         }
        
        while(fastPtr.next!=null){
        prev=slowPtr;
        slowPtr=slowPtr.next;
        fastPtr=fastPtr.next;
         }
    
        if(slowPtr==head)
            return head.next;
        prev.next=slowPtr.next;
        slowPtr.next=null;
        return head;
    }
}
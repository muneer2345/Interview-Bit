/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode head) {
        
        if(head==null) return head;
        
        ListNode slow=head,fast=head.next;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        //Found Mid point and split it into two lists
        ListNode first=head;
        ListNode second=slow.next;
        slow.next=null;
        
        second=reverseList(second);//Reversing the list
        
        //
        ListNode dummy=new ListNode(0);
        ListNode newHead=dummy;
        
        while(first!=null || second!=null)
        {
            if(first!=null)
            {
                dummy.next=first;
                first=first.next;
                dummy=dummy.next;
            }
            if(second!=null)
            {
                dummy.next=second;
                second=second.next;
                dummy=dummy.next;
            }
        }
        dummy.next=null;
        
        return newHead.next;
        
    }
    
    public ListNode reverseList(ListNode head)
    {
        if(head==null) return null;
        
     ListNode prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
       ListNode node = prev;
        return node;
    }
}

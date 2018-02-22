/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int value) {
        
        if(head==null) return head;
        
        ListNode dummy=new ListNode(0);
        ListNode dummy1=new ListNode(0);
        ListNode curr=dummy;
        ListNode curr1=dummy1;
        
        
        while(head!=null)
        {
            if(head.val<value)
            {
                curr.next=head;
                curr=head;
            }
            else 
            {
                curr1.next=head;
                curr1=head;
            }
            
            head=head.next;
        }
        
        curr1.next=null;
        curr.next=dummy1.next;
        return dummy.next;
    }
}

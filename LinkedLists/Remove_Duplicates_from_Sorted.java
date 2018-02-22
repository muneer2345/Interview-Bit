/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode p=head;
        ListNode q=head.next;
        ListNode r=head;
        
        while(q!=null)
        {
            while(p.val==q.val)
            {
                q=q.next;
                if(q==null)break;
            }
           
            p.next=q;
            p=q;
            if(q==null)break;
            q=q.next;
          //  System.out.println()
            
        }
        
        return head;
    }
}

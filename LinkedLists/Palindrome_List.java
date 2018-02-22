/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    int size=0;

    public int lPalin(ListNode head) {
        
        if(head==null) return 0;
        if(head.next==null) return 1;
        this.size=1;
        ListNode start=head;
        int size=getSize(head);
        int go=0;
        if(size%2==0)go=size/2;
        else go=(size+1)/2;
        
        ListNode mid=head;
        //ListNode q=head.next;
        int m=1;
        while(m!=go)
        {
            mid=mid.next;
            m++;
        }
    
       // Reverse logic
 
        ListNode p=mid;
        ListNode q=mid.next;
        ListNode r=mid;
        ListNode org=mid;
        
        while(q!=null)
        {
            ListNode temp=q.next;
            
            q.next=p;
            p=q;
            q=temp;

            if(q==null)
            {
                r=p;
            }
            
        }
       // org.next=null;
        //returning condition
        
        for(int i=1;i<=go;i++)
        {
            if(start.val!=p.val)
            {
                
                return 0;
                
            }
            start=start.next;
            p=p.next;
        }
        
        return 1;
    }
    
    public int getSize(ListNode head)
    {
        ListNode p=head;
        
        while(p.next!=null)
        {
            p=p.next;
            this.size+=1;
            
        }
        return this.size;
    }
   
   
}

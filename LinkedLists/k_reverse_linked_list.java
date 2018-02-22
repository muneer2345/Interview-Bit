/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head, int k) {
        if(head==null) return head;
        
        if(k==1)return head;
        
        int size=getSize(head);
        int n=size/k;
        ArrayList<ListNode> heads=new ArrayList<ListNode>();
        ArrayList<ListNode> tails=new ArrayList<ListNode>();
       
        int i=0;
        ListNode p=head,q=head.next,temp=head;
        ListNode newHead=p;
        while(i<n)
        {
        
            int j=1;
            while(j<k)
            {
                if(j==1)
                {
       
                    heads.add(p);
                }
               temp=q.next;
               q.next=p;
               p=q;
               if(j==k-1 )
               {
           //       System.out.println("Adding tail"+p.val);
                   tails.add(p);
               }
            //   if(j==k-1 && i==0)
            //   {
            //         newHead=p;
            //   }
               q=temp;
               j++;
            }
            
            if(i!=n-1){
            p=temp;
          //  System.out.println("P VALUE IS"+p.val);
            q=temp.next;
            // System.out.println("q VALUE IS"+q.val);
            }
            i++;
            
        }

        ListNode fix=heads.get(heads.size()-1);

        fix.next=null;
        
        int w=0;
        
        while(w<n-1)
        {
         
                heads.get(w).next=tails.get(w+1);
                     w++;
        }
        
        return tails.get(0);
        // for(int r=0;r<node.size()-1;r++)
        
        // {
        //     node.get(r).next=node.get(r+1);
        // }
        

        // return newHead;
    }
    public int getSize(ListNode head)
    {
        int size=1;
        while(head.next!=null)
        {
            head=head.next;
            size=size+1;
        }
        
        return size;
    }
}

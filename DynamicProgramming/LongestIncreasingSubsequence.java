public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lis(final List<Integer> A) {
        
        if(A==null || A.size()==0)return 0;
        
        if(A.size()==1) return 1;
        int max=1;
        
        int count[]=new int[A.size()];
        
        for(int i=0;i<A.size();i++)
        {
            count[i]=1;
        }
        
        for(int i=1;i<A.size();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(A.get(i)>A.get(j) && count[i]<count[j]+1)
                {
                    count[i]=count[j]+1;
                   // System.out.println("Counti"+count[i]);
                    // System.out.println("i"+i);
                    //S/ystem.out.println("j"+j);


                    if(count[i]>max)max=count[i];
                }
            }
        }
        
        
        return max;
    }
}

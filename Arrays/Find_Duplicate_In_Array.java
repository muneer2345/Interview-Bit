public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    
	    int res[]=new int[a.size()];
	    int result=-1;
	    for(int i:a)
	    {
	        if(res[i]==0)
	        {
	            res[i]=1;
	        }
	        
	        else if(res[i]==1)
	        {
	            result=i;
	            break;
	        }
	    }
	    
	    return result;
}
}
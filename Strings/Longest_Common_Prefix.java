public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        if(A.size()==1)return A.get(0);
        if(A.size()==0) return "";
        int min=Integer.MAX_VALUE;
        for(int i=0;i<A.size()-1;i++)
        {
    //        System.out.println(i);
            int k=0;
      //      System.out.println(A.get(i)+" SS "+A.get(i+1));
            k=prefix(A.get(i),A.get(i+1));
        //    System.out.println("PRefix length is"+k);
            if(k==0) return "";
            
            min=Math.min(k,min);
        }
        
        return A.get(0).substring(0,min);
        
    }
    public int prefix(String A, String B)
    {
        int len=0;
        int lenA=A.length();
        int lenB=B.length();
        int min=Math.min(lenA,lenB);
        
        for(int i=0;i<min;i++)
        {
            if(A.charAt(i)==B.charAt(i))
            {
                len++;
            }
            
            else
            {
                break;
            }
            
            
        }
        return len;
    }
}

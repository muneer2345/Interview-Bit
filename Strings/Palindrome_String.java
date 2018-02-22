public class Solution {
    public int isPalindrome(String A) {
        
         A=A.toLowerCase();
        int j=A.length()-1;
        int i=0;
        
        while(i <= j)
        {
        if(Character.isLetterOrDigit(A.charAt(i)) && Character.isLetterOrDigit(A.charAt(j)))
            {
                if(A.charAt(i)==A.charAt(j))
                {
                    i++;
                    j--;
                    
                }
                else
                {
                    return 0;
                }
                
            }
            else if(Character.isLetterOrDigit(A.charAt(i)) && !Character.isLetterOrDigit(A.charAt(j)))
            {
             j--;
                
            }
            else if(!Character.isLetterOrDigit(A.charAt(i)) && Character.isLetterOrDigit(A.charAt(j)))
            {
               i++;
                
            }
            else if(!Character.isLetterOrDigit(A.charAt(i)) && !Character.isLetterOrDigit(A.charAt(j)))
            {
            i++;
             j--;
                
            }
            
            
        }
        return 1;
    }
}

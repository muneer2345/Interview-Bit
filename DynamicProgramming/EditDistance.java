public class Solution {
    public int minDistance(String A, String B) {
        
        if(A.equals(B)) return 0;
        
        if(A==null) return B.length();
        
        if(B==null) return A.length();
        
        int rows=A.length();
        int columns=B.length();
        
        int dp[][]=new int [rows+1][columns+1];
        
        dp[0][0]=0;
        
        for(int i=1;i<=columns;i++)
        {
            dp[0][i]=i;
        }
        
        
        for(int i=1;i <=rows;i++)
        {
            dp[i][0]=i;
        }
        
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=columns;j++)
            {
                 if(A.charAt(i-1)==B.charAt(j-1))
                 {
                     dp[i][j]=dp[i-1][j-1];
                 }
                 
                 else
                 {
                     dp[i][j]=1 + Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]);
                 }
                 
              //  System.out.println(dp[i][j]+" ");
            }
        }
        
        return dp[rows][columns];
    }
}


public class LongestCommonString {
	
	public int LCS(String A, String B)
	{
		int rows=A.length();
		int columns=B.length();
		
		int dp[][]=new int[rows+1][columns+1];
		int result=0;
		
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=columns;j++)
			{
				if(i==0||j==0) {
					dp[i][j]=0;
				}
				
				else
				{
					if(A.charAt(i-1)==B.charAt(j-1))
					{
						dp[i][j]=dp[i-1][j-1]+1;
						
						result=Math.max(result,dp[i][j]);
					}
					
					else
					{
						dp[i][j]=0;
					}
				}
			}
		}
		
		
		
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String X = "OldSite:GeeksforGeeks.org";
        String Y = "NewSite:GeeksQuiz.com";
        
       System.out.println(new LongestCommonString().LCS(X, Y));
	}

}


public class LongestCommonSubSequence {
	
	public int LCSS(String A,String B)
	{
		int rows=A.length();
		int columns=B.length();
		
		int dp[][]=new int[rows+1][columns+1];
		
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
						dp[i][j]=1+dp[i-1][j-1];
					}
					else
					{
						dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
						
					}
				}
			}
		}
		
		return dp[rows][columns];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "AGGTAB";
	    String s2 = "GXTXAYB";
	   System.out.println(new LongestCommonSubSequence().LCSS(s1, s2));
	}

}

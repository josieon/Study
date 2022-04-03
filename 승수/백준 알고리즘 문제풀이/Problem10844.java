import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10844 {
	static long[][] D = new long[101][10];
	final static long MOD = 1000000000;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		long total = 0;
		for(int i=0;i<=9;i++)
		{
			if(i == 0)
				D[1][i] = 0;
			else
				D[1][i] = 1;
		}
		for(int i=2;i<=100;i++)
		{
			for(int j=0;j<=9;j++)
			{
				if(j==0)
				{
					D[i][0] = D[i-1][1]% MOD;
				}
				else if(j==9)
				{
					D[i][9] = D[i-1][8]% MOD;
				}
				else
				{
					D[i][j] = (D[i-1][j-1] + D[i-1][j+1])% MOD;
				}
			}
		}
		for(int i=0;i<=9;i++)
		{
			total += D[length][i];
		}
		System.out.println(total % MOD);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2193 {
	static long[][] D = new long[91][2];
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		D[1][0] = 0;
		D[1][1] = 1;
		for(int i=2;i<=90;i++)
		{
			D[i][0] = D[i-1][0]+ D[i-1][1];
			D[i][1] = D[i-1][0];
		}
		int length = Integer.parseInt(br.readLine());
		System.out.println(D[length][0] + D[length][1]);
	}
}

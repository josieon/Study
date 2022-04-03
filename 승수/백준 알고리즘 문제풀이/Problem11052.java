import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Problem11052 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numcard = Integer.parseInt(br.readLine());
		int[] price = new int[numcard+1];
		int[] d = new int[numcard+1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=1;i<=numcard;i++)
		{
			price[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=1;i<=numcard;i++)
		{
			for(int j=1;j<=i;j++)
			{
				d[i] = Math.max(d[i], d[i-j] + price[j]);
			}
		}
		System.out.println(d[numcard]);
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;;

public class Problem9613 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int sentence = Integer.parseInt(br.readLine());
		for(int i=0;i<sentence;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			long total = 0;
			int count = Integer.parseInt(st.nextToken());
			long[] number = new long[count];
			for(int j=0;j<count;j++)
			{
				number[j] = Integer.parseInt(st.nextToken());
			}
			for(int j=0;j<number.length;j++)
			{
				for(int k=j+1;k<number.length;k++)
				{
					total += GCD(number[j], number[k]);
				}
			}
			sb.append(total).append('\n');
		}
		System.out.print(sb);
	}
	public static long GCD(long a, long b)
	{
		if(a>=b)
		{
			if(a%b == 0)
				return b;
			else
			{
				a %=b;
				return GCD(a, b);
			}
		}
		else
		{
			if(b%a == 0)
				return a;
			else
			{
				b %= a;
				return GCD(a, b);
			}
		}
	}
}

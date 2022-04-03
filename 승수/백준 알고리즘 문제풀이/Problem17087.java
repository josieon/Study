import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//최대 공약수를 사용하면 푸는 문제
public class Problem17087 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long N = Integer.parseInt(st.nextToken());
		long S = Integer.parseInt(st.nextToken());
		long[] kids = new long[(int)N];
		long[] sub = new long[(int)N];
		long step;
		st = new StringTokenizer(br.readLine(), " ");
		int k=0;
		while(st.hasMoreTokens())
		{
			kids[k] = Integer.parseInt(st.nextToken());
			k++;
		}
		for(int i=0;i<N;i++)
		{
			sub[i] = Math.abs(kids[i] - S);
		}
		if(N==1)
		{
			step = sub[0];
		}
		else
		{
			step = GDC(sub[0], sub[1]);
			for(int i=2;i<N;i++)
			{
				step = GDC(step, sub[i]);
			}
		}
		System.out.println(step);
	}
	public static long GDC(long a, long b)
	{
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a>=b)
		{
			if(a%b == 0 )
				return b;
			else
			{
				a %= b;
				return GDC(a, b);
			}
		}
		else
		{
			if(b%a == 0)
				return a;
			else
			{
				b %= a;
				return GDC(a, b);
			}
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem17427_fail {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int gx = 0;
		
		for(int i=1;i<=N;i++)
		{
			gx += FunctionF(i);
		}
		System.out.println(gx);
		
	}
	public static int FunctionF(int x)
	{
		int fx=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				fx += i;
			}
		}
		if(fx==0)
			return 1;
		else
			return fx;
	}
	
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//약수를 구하는 방법 : 1. N의 제곱근을 구한다
//2. 1부터 제곱근까지 N의 약수를 구한다.
//N을 1~제곱근 사이의 약수로 나눈값도 약수가 된다.
public class Problem17427_fail2{
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
		int fx = 0;
		for(int i=1;i<=Math.sqrt(x);i++)
		{
			if(x%i == 0)
			{
				if(i!=x/i)
				{
					fx += i+x/i;
				}
				else
				{
					fx += i;
				}
			}
		}
		return fx;
	}
	
}

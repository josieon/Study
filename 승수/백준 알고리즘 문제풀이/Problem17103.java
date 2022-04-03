import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problem17103 {
	static int[] sosu = new int[1000001];
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int number = Integer.parseInt(br.readLine());
		findSosu();
		for(int i=0;i<number;i++)
		{
			int count = 0;
			int even = Integer.parseInt(br.readLine());
			int num1 = even/2;
			int num2 = even/2;
			for(int j=0;j<even/2;j++)
			{
				if(sosu[num1] !=0 && sosu[num2] !=0)
				{
					count++;
				}
				num1--;
				num2++;
			}
			sb.append(count).append('\n');
		}
		System.out.print(sb);
	}
	public static void findSosu()
	{
		for(int i=2;i<=1000000;i++)
		{
			sosu[i] = i;
		}
		for(int i=2;i<=1000000;i++)
		{
			if(sosu[i] == 0)
			{
				continue;
			}
			for(int j=i+i;j<=1000000;j+=i)
			{
				if(sosu[j] == 0)
					continue;
				sosu[j] = 0;
			}
		}
	}
}

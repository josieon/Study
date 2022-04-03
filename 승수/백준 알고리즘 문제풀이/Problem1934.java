 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.util.StringTokenizer;
 //유클리드 호재법을 사용하면 최대공약수를 찾을수 있다. 또한 최대공약수를 찾으면 최소공배수를 쉽게 찾을 수 있다.
public class Problem1934 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int max;
		int min;
		int count = Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int number1 = Integer.parseInt(st.nextToken());
			int number2 = Integer.parseInt(st.nextToken());
			int bank1 = number1;
			int bank2 = number2;
			while(true)
			{
				if(bank1>bank2)
				{
					bank1 = bank1 % bank2;
					if(bank1 == 0)
					{
						max = bank2;
						break;
					}
				}
				else
				{
					bank2 = bank2 % bank1;
					if(bank2 == 0)
					{
						max = bank1;
						break;
					}
				}
			}
			min = max * (number1 / max) * (number2 / max);
			sb.append(min).append('\n');
		}
		System.out.println(sb);
	}
}

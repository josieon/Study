 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.util.StringTokenizer;
 
public class Problem2609 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int number1 = Integer.parseInt(st.nextToken());
		int number2 = Integer.parseInt(st.nextToken());
		int bank1 = number1;
		int bank2 = number2;
		int max;
		int min;
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
		StringBuilder sb = new StringBuilder();
		sb.append(max).append('\n').append(min);
		System.out.println(sb);
	}
}

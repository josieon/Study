import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem2004{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long number1 = Integer.parseInt(st.nextToken());
		long number2 = Integer.parseInt(st.nextToken());
		long number3;
		long numof2_1 = 0;
		long numof5_1 = 0;
		long numof2_2 = 0;
		long numof5_2 = 0;
		long numof2_3 = 0;
		long numof5_3 = 0;
		
		if(number2 < number1 - number2)
		{
			number2 = number1 - number2;
		}
		number3 = number1 - number2;
		
		long temp = number1;
		while(temp>=2)
		{
			numof2_1 = numof2_1 + temp/2;
			temp /= 2;
		}
		temp = number1;
		while(temp>=5)
		{
			numof5_1 = numof5_1 + temp/5;
			temp /=5;
		}
		
		temp = number3;
		while(temp>=2)
		{
			numof2_3 = numof2_3 + temp/2;
			temp /= 2;
		}
		temp = number3;
		while(temp>=5)
		{
			numof5_3 = numof5_3 + temp/5;
			temp /=5;
		}
		
		temp = number2;
		while(temp>=2)
		{
			numof2_2 = numof2_2 + temp/2;
			temp /= 2;
		}
		temp = number2;
		while(temp>=5)
		{
			numof5_2 = numof5_2 + temp/5;
			temp /=5;
		}
		
		numof2_1 = numof2_1 - numof2_3 - numof2_2;
		numof5_1 = numof5_1 - numof5_3 - numof5_2;
		if(numof2_1<=numof5_1)
			System.out.println(numof2_1);
		else
			System.out.println(numof5_1);
		
	}
}
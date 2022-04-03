import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Problem1676_2 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int count = 0;
		while(number>=5)
		{
			count = count + number/5;
			number/=5;
		}
		System.out.print(count);
	}

}

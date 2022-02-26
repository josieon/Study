import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem4375 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String str1 = br.readLine();
			if(str1 == null)
				break;
			int number = Integer.parseInt(str1);
			int count =0;
			for(int i=1;i<=number;i++)
			{
				count = count*10+1;
				count %= number;
				if(count ==0)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
}

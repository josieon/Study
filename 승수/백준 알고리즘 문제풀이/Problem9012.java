import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Problem9012 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number =  Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<number;i++)
		{
			int a = 0, b = 0;
			String arr = new String();
			arr = br.readLine();
			for(int j=0;j<arr.length();j++)
			{
				if(arr.charAt(j) == '(')
					a++;
				else
					b++;
				if(b>a)
				{
					sb.append("NO").append('\n');
					break;
				}
				else
				{
					if(j == arr.length()-1)
					{
						if(a!=b)
							sb.append("NO").append('\n');
						else
							sb.append("YES").append('\n');
					}
					else
						continue;
				}
			}
		}
		System.out.println(sb);
	}
}

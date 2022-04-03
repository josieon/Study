import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problem10820 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int small = 0, big = 0, number =0, space = 0;
		String str = new String();
		while((str = br.readLine()) != null)
		{
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i) == ' ')
				{
					space++;
				}
				else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
				{
					small++;
				}
				else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
				{
					big++;
				}
				else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
				{
					number++;
				}
			}
			sb.append(small+" ").append(big+" ").append(number+ " ").append(space).append('\n');
			System.out.print(sb);
			space = 0;
			number =0;
			big =0;
			small =0;
		}
	}
}

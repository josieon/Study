import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Problem11655 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		sb.append(str);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A'&&str.charAt(i)<='M')
				sb.setCharAt(i, (char)(str.charAt(i)+13));
			else if(str.charAt(i)>='N'&&str.charAt(i)<='Z')
				sb.setCharAt(i, (char)(str.charAt(i)-13));
			else if(str.charAt(i)>='a'&&str.charAt(i)<='m')
				sb.setCharAt(i, (char)(str.charAt(i)+13));
			else if(str.charAt(i)>='n'&&str.charAt(i)<='z')
				sb.setCharAt(i, (char)(str.charAt(i)-13));
		}
		System.out.println(sb);
	}
}

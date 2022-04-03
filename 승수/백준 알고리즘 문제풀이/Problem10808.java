import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10808 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] alphabet = new int[26];
		String str =new String();
		str = br.readLine();
		for(int i=0;i<str.length();i++)
		{
			alphabet[str.charAt(i) - 'a']++;
		}
		for(int i=0;i<alphabet.length;i++)
		{
			sb.append(alphabet[i]).append(" ");
		}
		System.out.print(sb);
	}
}

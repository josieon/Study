import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem9093 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number= Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<number;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens())
			{
				StringBuffer SBF = new StringBuffer();
				SBF.append(st.nextToken());
				sb.append(SBF.reverse()).append(" ");
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}

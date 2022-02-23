package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N1152 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int cnt = 0;
		while(true) {
			if(!st.hasMoreTokens())
				break;
			st.nextToken();
			cnt++;
		}
		System.out.println(cnt);
	}

}

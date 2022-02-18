package baekjoon;
import java.io.*;
public class N11720 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		char[] c = str.toCharArray();
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum += (int)c[i] - 48;
		}
		System.out.println(sum);
	}

}

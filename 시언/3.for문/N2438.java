package baekjoon;
import java.io.*;
public class N2438 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<=N; i++) {
			for(int j=0; j<i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}

}

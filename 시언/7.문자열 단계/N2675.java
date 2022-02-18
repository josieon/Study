package baekjoon;
import java.io.*;
public class N2675 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String str = br.readLine();
			int N = Integer.parseInt(str.substring(0, 1));
			str=str.substring(2);
			char[] c = str.toCharArray();
			for(int j=0; j<c.length; j++) {
				for(int p=0; p<N; p++) {
					bw.write(c[j]);
				}
			}
			bw.write("\n");
		}
		bw.flush();
	}

}

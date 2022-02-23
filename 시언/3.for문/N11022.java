package baekjoon;
import java.io.*;
public class N11022 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<=N;i++) {
			String str = br.readLine();
			int a=Integer.parseInt(str.split(" ")[0]);
			int b=Integer.parseInt(str.split(" ")[1]);
			bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
		}
		bw.flush();
	}

}

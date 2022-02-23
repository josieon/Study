package baekjoon;
import java.io.*;
public class N1110 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int num = N;
		int count = 1;
		while(true) {
			num = (num / 10 + num % 10) % 10 + (num % 10) * 10;
			if(num == N)
				break;
			count++;
		}
		System.out.println(count);
	}

}

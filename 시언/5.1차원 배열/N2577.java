package baekjoon;
import java.io.*;
public class N2577 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		int num = A * B * C;
		while(true) {
			if(num == 0)
				break;
			arr[num%10]++;
			num = num/10;
		}
		for(int i=0; i<10; i++) {
			bw.write(arr[i]+"\n");
		}
		bw.flush();
	}

}

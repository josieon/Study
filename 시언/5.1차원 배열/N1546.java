package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N1546 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		float[] arr = new float[N];
		float M = 0;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			arr[i] = Float.parseFloat(st.nextToken());
			if(arr[i] > M)
				M = arr[i];
		}
		float sum = 0;
		for(int i=0; i<N; i++) {
			arr[i] = arr[i] / M * 100;
			sum += arr[i];
		}
		System.out.println(sum / N);
	}

}

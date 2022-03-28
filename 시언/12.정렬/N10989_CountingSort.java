import java.io.*;
public class N10989_CountingSort {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] input = new int[N];
		int max = 0;
		for(int i=0; i<N; i++) {
			input[i] = Integer.parseInt(br.readLine());
			if(max < input[i])
				max = input[i];
		}
		int[] counts = new int[max+1];
		for(int i=0; i<N; i++) {
			counts[input[i]]++;
		}
		for(int i=1; i<=max; i++) {
			counts[i] += counts[i-1];
		}
		int[] ans = new int[counts[max]];
		for(int i=0; i<N; i++) {
			ans[counts[input[i]] - 1] = input[i];
			counts[input[i]]--;
		}
		for(int i=0; i<N; i++) {
			bw.write(Integer.toString(ans[i]) + '\n');
		}
		bw.flush();
		bw.close();
	}

}

// 본 문제를 풀면서 CountingSort의 개념을 잡기 좋았다.
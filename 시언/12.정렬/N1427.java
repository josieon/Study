import java.io.*;
import java.util.Arrays;
public class N1427 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int length = 11;
		for(int i=10; i >= 0; i--) {
			if(N / (int)Math.pow(10, i) != 0)
				break;
			length--;
		}
		int[] input = new int[length];
		int max = 0;
		for(int i=0; i<input.length; i++) {
			input[i] = N % 10;
			if(max < input[i])
				max = input[i];
			N = N / 10;
		}
		int[] counts = new int[max+1];
		for(int i=0; i<length; i++) {
			counts[input[i]] += 1;
		}
		for(int i=1; i<counts.length; i++) {
			counts[i] += counts[i-1];
		}
		int[] ans = new int[counts[max]];
		for(int i=0; i<length; i++) {
			ans[counts[input[i]] - 1] = input[i];
			counts[input[i]]--;
		}
		for(int i=ans.length-1; i>=0; i--) {
			bw.write(Integer.toString(ans[i]));
		}
		bw.flush();
		bw.close();
	}

}
// 소요시간 124ms
// CountingSort를 세번째 풀다보니 이제는 많이 익숙해졌다.
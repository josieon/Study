import java.io.*;
public class N2108_CountingSort {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] counts = new int[8001];
		int[] input = new int[N];
		int sum = 0;
		int max = -4000;
		for(int i=0; i<N; i++) {
			input[i] = Integer.parseInt(br.readLine());
			sum += input[i];
			if(max < input[i])
				max = input[i];
		}
		int max_cnt = 0;
		int idx = 0;
		for(int i=0; i<N; i++) {
			counts[input[i] + 4000]++;
		}
		for(int i=0; i<counts.length; i++) {
			if(max_cnt < counts[i]) {
				max_cnt = counts[i];
				idx = i;
			}
		}
		for(int i=0; i<counts.length; i++) {
			if(idx == i)
				continue;
			if(max_cnt == counts[i]) {
				idx = i;
				break;
			}
		}
		for(int i=1; i<counts.length; i++) {
			counts[i] += counts[i-1];
		}
		int[] ans = new int[counts[max + 4000]];
		for(int i=0; i<N; i++) {
			ans[counts[input[i] + 4000] - 1] = input[i];
			counts[input[i] + 4000]--;
		}
		bw.write(Integer.toString(Math.round((float)sum/N)) + '\n');
		bw.write(Integer.toString(ans[N/2]) + '\n');
		bw.write(Integer.toString(idx - 4000) + '\n');
		bw.write(Integer.toString(ans[N-1] - ans[0]) + '\n');
		bw.flush();
		bw.close();
	}

}
// Arrays.sort는 568ms, CountingSort는 364ms가 소요되었다.
//  CountingSort가 빠르긴 하지만 입력범위와 최댓값에 따라 소요시간이나 배열의 크기가 매우 달라지므로
// 유의해서 사용해야 할 것 같다.
import java.io.*;
import java.util.Arrays;
public class N2108_ArraysSort {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] input = new int[N];
		int sum = 0;
		for(int i=0; i<N; i++) {
			input[i] = Integer.parseInt(br.readLine());
			sum += input[i];
		}
		Arrays.sort(input);
		int range = input[N-1] - input[0];
		int[] cnt = new int[range + 1];
		for(int i=0; i<N; i++) {
			cnt[input[i] - input[0]]++;
		}
		int max = 0;
		int idx = 0;
		for(int i=0; i < cnt.length; i++) {
			if(max < cnt[i]) {
				max = cnt[i];
				idx = i; 
			}
		}
		for(int i=0; i<cnt.length; i++) {
			if(i == idx)
				continue;
			if(max == cnt[i]) {
				idx = i;
				break;
			}
		}
		bw.write(Integer.toString(Math.round((float)sum/N)) + '\n');
		bw.write(Integer.toString(input[N/2]) +'\n');
		bw.write(Integer.toString(idx + input[0]) +'\n');
		bw.write(Integer.toString(range));
		bw.flush();
		bw.close();
	}

}

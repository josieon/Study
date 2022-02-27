package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
import java.lang.Math;
public class N4153 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int[] arr = new int[3];
			int max_idx=0, max=0;
			for(int i=0; i<3; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			if(arr[0]==0)
				break;
			for(int i=0; i<3; i++) {
				if(max < arr[i]) {
					max = arr[i];
					max_idx = i;
				}
			}
			int sum = 0;
			for(int i=0; i<3; i++) {
				if(max_idx == i)
					continue;
				sum += Math.pow(arr[i], 2);
			}
			if(sum == Math.pow(max, 2))
				sb.append("right\n");
			else
				sb.append("wrong\n");
		}
		System.out.println(sb);
	}
}

package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N2798 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()," ");
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 0;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(j == i)
					continue;
				for(int k=0; k<N; k++) {
					if(k == j || k == i)
						continue;
					int val = arr[i] + arr[j] + arr[k];
					if((M - sum) > (M - val) && (M - val) >= 0)
						sum = val;
				}
			}
		}
		System.out.println(sum);
	}

}
// 소요시간: 10분
// 브루트포스가 상당히 무식하다는 것을 알았다. 어쨌든 정답이 될 수 있는 범위 내의 모든 경우를 탐색하는 알고리즘이기에 삼중 반복문을 사용하게 되었다.

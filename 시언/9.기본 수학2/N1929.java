package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N1929 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		boolean[] arr = new boolean[1000001];
		arr[1] = true;
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		for(int i=2; i<=1000; i++) {
			int j=2;
			while(true) {
				arr[i*j] = true;
				j++;
				if(i*j > 1000000)
					break;
			}
		}
		for(int i=M; i<=N; i++) {
			if(arr[i] == false)
				bw.write(Integer.toString(i) + '\n');
		}
		bw.flush();
	}

}
// 본 문제는 에라토스테네스의 채를 이용해 푸는 문제이기 때문에 문제에서 주어진 수의 범위인 1000000까지의 배열을 할당하고 반복문을 통해서 소수의 배수들은 true로 값을 초기화해준다.
// 따라서 M부터 N까지 배열을 참조해 false인 값, 즉 소수인 값만 출력하면 된다. 그러나 실행시간이 320ms로 시간이 다소 소요된다.
// 다른사람의 문제풀이를 찾아보면 N값을 받고나서 N 크기의 배열을 할당하여 반복문을 통해 에라토스테네스의 채를 적용한다. 이게 좀 더 효율적인 방법임을 알 수 있다.
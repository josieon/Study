package baekjoon;
import java.io.*;
public class N2231 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int ans = N;
		for(int i=N/2; i<N; i++) {
			if(func(i) == N) {
				ans = i;
				System.out.println(i);
				break;
			}
		}
		if(ans == N)
			System.out.println(0);
	}
	
	public static int func(int N) {
		int ans = N;
		while(true) {
			ans += N % 10;
			N = N / 10;
			if(N == 0)
				break;
		}
		return ans;
	}

}
// 소요시간: 10분
// 기존에 생성자 문제를 풀어봤기 때문에 함수 구현을 바로 할 수 있었다. 브루트 포스이기에 반복문을 1부터 N-1까지 하는 게 맞겠지만, 생성자라는 개념을 따져보면 N/2 아래의 숫자는 생성자가 될 수가 없다.
// 따라서 시작 인덱스를 N/2로 하였고, 이 때 발생하는 예외가 인덱스가 N이 1인 경우인데, 처리만 해주면 된다.
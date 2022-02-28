package baekjoon;
import java.io.*;
public class N10870 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(Fibonacci(N));
	}
	
	public static int Fibonacci(int N) {
		if(N == 0)
			return 0;
		if(N == 1)
			return 1;
		return Fibonacci(N-1) + Fibonacci(N-2);
	}
}

// 소요시간 : 3분
// 이전 문제인 팩토리얼 문제와 동일하게 기본적인 재귀 문제이다. 알고리즘 시간에 풀어본 적이 있는 문제라 바로 풀 수 있었다.
// base case인 N이 0, 1일 경우만 예외 처리 해주고 general case를 정의해주면 쉽다.
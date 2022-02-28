package baekjoon;
import java.io.*;
public class N10872 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(Factorial(N));
	}
	
	public static int Factorial(int N) {
		if(N == 0)
			return 1;
		return N * Factorial(N-1);
	}
}

// 소요 시간 : 3분
// 기존에 알고 있는 문제라서 쉽게 풀었다. 재귀 문제가 그렇듯 base case와 general case만 잘 정의해준다면 직관적으로 풀 수 있는 재귀함수이다. 
package baekjoon;
import java.io.*;
import java.lang.Math;
public class N2581 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int min = 0;
		int sum = 0;
		for(int i=M; i<=N; i++) {
			if(isPrime(i)) {
				sum += i;
				if(min == 0)
					min = i;
			}
		}
		if(sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	public static boolean isPrime(int num) {
		if(num==1)
			return false;
		for(int i=2; i <= Math.sqrt(num); i++) {
			if(num % i == 0)
				return false;
		}
		return true;
	}
}
// 이전 문제인 1978번을 통해 2부터 제곱근까지 반복문을 통해서 소수인지 판별하는 것을 알았다. 이를 적용해서 풀었다.
// 소수문제를 연달아 풀다보니 이번 문제는 다소 쉬웠다.
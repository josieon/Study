package baekjoon;
import java.io.*;
import java.lang.Math;
public class N4948 {
	public static boolean[] prime = new boolean[246913];
	public static int[] cnt_arr = new int[246913];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		get_prime();
		get_count();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0)
				break;
			bw.write(Integer.toString(cnt_arr[2*n] - cnt_arr[n]) + '\n');
		}
		bw.flush();
	}
	
	public static void get_prime() {
		prime[0] = prime[1] = true;
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i])
				continue;
			for(int j = i * i; j < prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}
	
	public static void get_count() {
		int cnt = 0;
		for(int i = 2; i < prime.length; i++) {
			if(!prime[i])
				cnt++;
			cnt_arr[i] = cnt;
		}
	}
}
// 처음 스스로 풀었을 때는 값이 입력되면 n부터 2n까지 반복문을 돌면서 isPrime함수를 만들어 호출하면서 소수의 개수를 세어 출력하는 식으로 짰다.
// 그러나 1048ms라는 긴 실행시간이 걸렸고, 원인은 중복된 함수호출이 굉장히 많이 이루어지고 그 함수가 반복문이기 때문에 반복문이 많이 돌기 때문이다.
// 다른 사람의 문제풀이를 보니 에라토스테네스의 채를 사용을 한다. 이는 입력값의 범위를 안다면 배열을 할당해 이중반복문을 통해 소수 여부를 한 번만 판단하면 된다.
// 여러 개의 입력이 들어온다면 여러 번의 연산을 할 필요없이 값을 참조만 할 수 있게 짜는 것이 실행시간을 줄이는 핵심포인트이다.
// 에라토스테네스를 통해 구현을 한다면 시간이 상당히 줄지만 입력 값이 들어온 횟수만큼 배열 값을 참조해 몇 개인지 세는 반복문도 호출이 된다.
// 이를 줄이기 위해 카운트 배열을 또 할당하여 n까지의 소수의 개수를 값으로 가지는 배열을 초기화한다면 여러 개의 입력이 들어와도 이 배열의 값을 참조만 하면 된다.
// 따라서 입력의 개수가 늘어나면 늘어날수록 후자의 방법이 훨씬 빠르고 후자의 알고리즘을 제출하였을 때는 160ms밖에 안 걸렸다. 
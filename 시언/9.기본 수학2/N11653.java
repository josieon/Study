package baekjoon;
import java.io.*;
public class N11653 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int i = 2;
		while(true) {
			if(N == 1)
				break;
			if(i > (int)Math.sqrt(N)) {
				bw.write(Integer.toString(N) + '\n');
				break;
			}
			if(N % i == 0) {
				bw.write(Integer.toString(i) + '\n');
				N = N / i;
				i--;
			}
			i++;
		}
		bw.flush();
	}

}
// 처음에 i가 N과 같아지면 break되도록 하였는데 시간초과가 되었다. 앞의 소수를 구하는 것과 비슷하게 N의 제곱근까지 반복문이 돈다면 그 이상은 더 확인해 볼 필요가 없다. 그렇게 반복횟수를 줄였다.
// 그리고 오답이 나왔는데, 1에 대한 예외처리를 해주지 않아서였다. 문제를 제대로 읽어보면 어떤 경우가 예외처리가 필요한지 보이는데 제대로 읽지않아서 생긴 문제이다. 잘 읽자. 힌트는 문제에 있다.
package baekjoon;
import java.io.*;
public class N2839 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num5 = N / 5;
		int num3 = (N - 5 * num5) / 3;
		int temp = (N - (num5 * 5)) % 3;
		while(true) {
			if(temp == 0)
				break;
			if(temp != 0 && num5 == 0)
				break;
			num5--;
			num3 = (N - 5 * num5) / 3;
			temp = (N - (num5 * 5)) % 3;
		}
		if(temp != 0)
			System.out.println(-1);
		else
			System.out.println(num3 + num5);
	}

}
// 본 문제는 상대적으로 쉬웠다. 푸는데 10분정도 소요되었다. 문제해결방법과 예외에 대한 생각을 다지는데 기본이 되는 문제라고 생각한다. 
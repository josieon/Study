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
// �ҿ�ð�: 10��
// ������ ������ ������ Ǯ��ñ� ������ �Լ� ������ �ٷ� �� �� �־���. ���Ʈ �����̱⿡ �ݺ����� 1���� N-1���� �ϴ� �� �°�����, �����ڶ�� ������ �������� N/2 �Ʒ��� ���ڴ� �����ڰ� �� ���� ����.
// ���� ���� �ε����� N/2�� �Ͽ���, �� �� �߻��ϴ� ���ܰ� �ε����� N�� 1�� ����ε�, ó���� ���ָ� �ȴ�.
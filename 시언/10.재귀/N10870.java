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

// �ҿ�ð� : 3��
// ���� ������ ���丮�� ������ �����ϰ� �⺻���� ��� �����̴�. �˰��� �ð��� Ǯ� ���� �ִ� ������ �ٷ� Ǯ �� �־���.
// base case�� N�� 0, 1�� ��츸 ���� ó�� ���ְ� general case�� �������ָ� ����.
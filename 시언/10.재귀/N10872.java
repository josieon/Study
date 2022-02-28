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

// �ҿ� �ð� : 3��
// ������ �˰� �ִ� ������ ���� Ǯ����. ��� ������ �׷��� base case�� general case�� �� �������شٸ� ���������� Ǯ �� �ִ� ����Լ��̴�. 
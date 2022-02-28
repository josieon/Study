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
// �� ������ ��������� ������. Ǫ�µ� 10������ �ҿ�Ǿ���. �����ذ����� ���ܿ� ���� ������ �����µ� �⺻�� �Ǵ� ������� �����Ѵ�. 
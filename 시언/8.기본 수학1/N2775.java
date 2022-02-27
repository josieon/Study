package baekjoon;
import java.io.*;
public class N2775 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(func(k, n));
		}
	}
	public static int func(int k, int n) {
		if(k==0)
			return n;
		else {
			int sum = 0;
			for(int i=1; i<n+1; i++) {
				sum += func(k-1,i); 
			}
			return sum;
		}
	}

}
// �� �������� ����ó�� ��Ģ�� ã�� Ǯ���� �Ͽ����� ��ȭ������ ���� ���¿���. ���� ����� �������� ������ ����Ǿ recursion�� ����ϰ��� �ߴ�.
// k�� nȣ�� �ο��� ���ϱ� ���ؼ��� k-1�� 1ȣ���� nȣ���� �ο��� ���ϸ� �Ǿ��⿡ �ݺ����� ���� sum�̶�� ������ ���� ��� �����ִ� ���� Ȯ���� �� �ִ�.(general case)
// k�� 0, �� 0�������� nȣ�� n���� �ο��� ����ֱ� ������ n���� return���ش�.(base case)
// �̷��� ������ Ǯ�鼭 ������ ������ ����� ���������� Ǯ�� �Ͽ�����, ������ �Լ��� ���� �� ȣ��Ǵ� ������ �߻��Ѵٴ� ���̴�.
// ���� ���, func(5,4)�� ��� sum���� func(4,1) + func(4,2) + func(4,3) + func(4,4)�� �Ǵµ�
// func(4,3)�� ��� func(3,1) + func(3,2) + func(3,3)
// func(4,4)�� ��� func(3,1) + func(3,2) + func(3,3) + func(3,4)
// ���� func(3,1), func(3,2), func(3,3)�� �ߺ��Ǿ� �� ���� ȣ���ϴ� ��찡 �߻��ߴ�.
// �ð��� ���� 416ms�� �ҿ�Ǵµ� �̷��� ����� �����ϸ� ���� ���� ������ �ذ�ɰ��̴�. ���� �� ������ recursion���� Ǯ�⿡ �������ϴ�.
// �ٸ� ����� Ǯ�̸� ���� ������ �迭�� �̿��� Ǭ��. �ܼ��ϰ� Ǭ�ٸ� ������ �迭�� �ξ� ������ ������ ���δ�.
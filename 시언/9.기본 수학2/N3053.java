package baekjoon;
import java.io.*;
import java.lang.Math;
public class N3053 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		System.out.println(String.format("%.6f", R*R*Math.PI));
		System.out.println(R*R*2);
	}

}
// �ҿ�ð� : 5��
// ��Ŭ���� ������, ����Ŭ���� ������, �ý� ������ �� �𸣴� �ܾ���� ���ͼ� �˻��ؼ� ���θ� �ؾ� �ϳ� �;��µ�
// ���� �Է°� ���� ����� ���� ���� �ʺ� ���ϴ� �� ù��°�� �׳� ���� ����, �ý� �����п����� ���� ���̴� ����������*2�ΰ� ���Ƽ� �׷��� Ǯ������
// ����ó���Ǿ���.
// �׳� �� ������ ���������������� ����� ��� ��Ű������ ���� ���� �������ٴ� ������ ���.
// String.format �޼ҵ带 �̿��� Ǯ���־���.
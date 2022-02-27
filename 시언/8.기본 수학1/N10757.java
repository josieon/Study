package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N10757 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String A = new String(st.nextToken());
		String B = new String(st.nextToken());
		String temp;
		if(A.length() < B.length()) {
			temp = A;
			A = B;
			B = temp;
		}	//�� String�� A, ª�� String�� B�� ����
		temp = "";
		int up = 0;
		int i;
		for(i=0; i<A.length(); i++) {
			int value;
			if(i < B.length()) {
				value = (int)A.charAt(A.length() - 1 - i) + (int)B.charAt(B.length() - 1 - i) - 48 + up;
				if(value > 57) {
					value -= 10;
					up = 1;
				}
				else
					up = 0;
			}
			else {
				value = (int)A.charAt(A.length() - 1 - i) + up;
				if(value > 57) {
					value -= 10;
					up = 1;
				}
				else
					up = 0;
			}
			temp += (char)value;
		}
		if(up == 1)
			temp += '1';
		for(i=0; i<temp.length(); i++)
			bw.write(temp.charAt(temp.length() - 1 - i));
		bw.flush();
	}

}
// �� ������ Ǫ�µ��� �ѽð��� �ҿ��Ͽ���. ó������ longŸ������ �ް��� ������ �������� �Է°��� ������ 10^10000�����̱⿡ longŸ�� ���� �����ϴ�.
// ����̿� �¼��� String���� �޾Ƽ� adder�� �����ؾ��Ѵٰ� �Ͽ���.
// �� ���� ���� �Է¹޾� String���� �ް� �ݺ����� ���� ���̰� �� ���ڿ��� ª�� ���ڿ��� �Ǻ����־���.
// �� ���ڿ��� ���̸�ŭ �ݺ����� ���鼭 ª�� ���ڿ��� ���̱����� �� ���� �� �ڸ��� ���� �����ְ� ª�� ���ڿ��� ���̸� �Ѿ�� �� ���ڿ��� �״�� ���ڿ��� �־��ش�.
// up�̶�� ������ �Ҵ��� �ڸ��� �ø��� ���־���.
// �̹� ������ ���� ������ ���� String�� charAt�Լ��� ���� ������ �� �� �ڸ����� ������ �ؾ������� ���������� ���ϴٴ� ���̴�. String.length()�� ���� ������ �ڸ����� ���ٰ����ϴ�.
// �׸��� ���ϱ� ������ ���� String�� ���ڸ� �߰����ٶ� index 0�� �߰��� �Ǵ� ���� �� �� �־���. �׷��Ƿ� �������� �ݺ����� ���� String�� ������ �ڸ����� ������ ����� ���ִ� ���� �����ִ�.
// �ٸ� ����� �ڵ带 ���� ũ�� �� ���� ������� Ǯ����. 1. �迭�� �̿�, 2. BigInteger Ŭ���� �̿�
// 1���� ����� String���� ���� ���� �� �� String �ڸ�����ŭ�� �迭�� �Ҵ��� �� ���� �� �� ���ں��� �������� �ϳ��� �����Ѵ�. �׸��� ���ϱ� ���� �� �ø� ������ �ݺ����� ���� ����
// 2���� ����� ����� �����ϴ�. String���� ���� �ް� BigIntegerŬ������ add �Լ��� ȣ���� Ǭ��.
// ���� Ǭ ��� : 240ms		1�� ��� : 136ms		2�� ��� : 268ms
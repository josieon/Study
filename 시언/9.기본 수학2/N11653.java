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
// ó���� i�� N�� �������� break�ǵ��� �Ͽ��µ� �ð��ʰ��� �Ǿ���. ���� �Ҽ��� ���ϴ� �Ͱ� ����ϰ� N�� �����ٱ��� �ݺ����� ���ٸ� �� �̻��� �� Ȯ���� �� �ʿ䰡 ����. �׷��� �ݺ�Ƚ���� �ٿ���.
// �׸��� ������ ���Դµ�, 1�� ���� ����ó���� ������ �ʾƼ�����. ������ ����� �о�� � ��찡 ����ó���� �ʿ����� ���̴µ� ����� �����ʾƼ� ���� �����̴�. �� ����. ��Ʈ�� ������ �ִ�.
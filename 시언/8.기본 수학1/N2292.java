package baekjoon;
import java.io.*;
public class N2292 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<100000; i++) {
			if(N==1) {
			 	System.out.println(1);
				break;
			}
			long dur = 6 * (i+1);
			long start = 6 * i * (i+1) / 2 + 2;
			long end = start + dur - 1;
			if(start<=N && N<=end) {
				System.out.println(i+2);
				break;
			}
		}
	}
}
//�� ������ ���� ���� Ǯ���µ� �Ʒ��� ���� Ǫ�� ���� �ξ� �������� �� ����. ����ð��� �Ȱ���.
//���� ������ �ּҰ�~�ִ밪�� �� ���� ��� �ʱ�ȭ��Ű�鼭 �ݺ����� �����µ� �ּҰ��� ������ �ݺ����� ������ �� �� ����.
/*public class N2292 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 1;
		int range = 2;
		if(N == 1)
			System.out.println(1);
		else {
			while(range <= N) {
				range = range + count*6;
				count++;
			}
			System.out.println(count);
		}
	}
}*/
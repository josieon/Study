package baekjoon;
import java.io.*;
import java.lang.Math;
public class N9020 {
	public static boolean[] prime = new boolean[10001];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		get_prime();
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			for(int j=n/2; j>1; j--) {
				if(!prime[j] && !prime[n-j]) {
					bw.write(Integer.toString(j) + " " + Integer.toString(n-j) + "\n");
					break;
				}
			}
		}
		bw.flush();
	}
	public static void get_prime() {
		prime[0] = prime[1] = true;
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i])
				continue;
			for(int j=i*i; j<prime.length; j+=i)
				prime[j] = true;
		}
	}
}
// �ռ� ������ Ǯ ���� ���������� �Է��� ������ �ټ��̱� ������ �����佺�׳׽��� ä�� �̿��ϴ� ���� ȿ�����̹Ƿ� �̸� �̿��� Ǯ����.
// ���� �ԷµǸ� �� ���� ���ݰ����� ���� �ٿ����� �迭�� �����Ѵ�. �� �Ҽ��� ���̰� ���� ���� ��츦 ����ϱ⿡ ���� ���� ��������� �����ߴ�.
// ���� ���� Ǯ���� �� 236ms�� ����ð��� �ҿ�Ǿ���.
// �ٸ� ����� ����Ǯ�̸� ã�ƺ����� �� StringBuilder�� �̿��� ����ϴ� ���� �� �ð��� ������.
// StringBuilder�� BufferedWriter�� �������� �����ϰ� �������ڸ�
// StringBuilder�� �������� String�̴�. �� ���� �޸𸮿� �ִ� String������ ���� �߰�, ����, ���� �� �����Ѵٰ� ���� �ȴ�. �̸� �������� �����ġ�� ����� �ѹ��� ���ش�.
// BufferedWriter�� ��¹��۽�Ʈ���� ���� �߰����ش�. �Ѱ����� ������ ũ�Ⱑ �������� �ʰ��ȸ�ŭ flush�� �Ǿ������. Ȥ�� flush�Լ��� ȣ���� ������ ������ �����ġ�� �ѹ��� ���ش�.
// ���� �ü���� ��� ���������� �ʾƼ� ��¹��۽�Ʈ���� ���� �߰��ϴ� �Ͱ� ���θ޸𸮰��� �ε��ϴ� ���� ȿ���� ���� �������� ���ؼ��� �� ���� ���Ͽ��� �� ������ �˰� �Ѿ��.
// ����� ���� �޸𸮿� ����� ������ ���� �ٲٴٰ� �ѹ��� ����ϴ� ���� ���ۿ� ����� ���� �ٲٴٰ� �ѹ��� ����ϴ� �ͺ��� �����ٴ� ���̴�.
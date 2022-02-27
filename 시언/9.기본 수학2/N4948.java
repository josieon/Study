package baekjoon;
import java.io.*;
import java.lang.Math;
public class N4948 {
	public static boolean[] prime = new boolean[246913];
	public static int[] cnt_arr = new int[246913];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		get_prime();
		get_count();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n==0)
				break;
			bw.write(Integer.toString(cnt_arr[2*n] - cnt_arr[n]) + '\n');
		}
		bw.flush();
	}
	
	public static void get_prime() {
		prime[0] = prime[1] = true;
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i])
				continue;
			for(int j = i * i; j < prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}
	
	public static void get_count() {
		int cnt = 0;
		for(int i = 2; i < prime.length; i++) {
			if(!prime[i])
				cnt++;
			cnt_arr[i] = cnt;
		}
	}
}
// ó�� ������ Ǯ���� ���� ���� �ԷµǸ� n���� 2n���� �ݺ����� ���鼭 isPrime�Լ��� ����� ȣ���ϸ鼭 �Ҽ��� ������ ���� ����ϴ� ������ ®��.
// �׷��� 1048ms��� �� ����ð��� �ɷȰ�, ������ �ߺ��� �Լ�ȣ���� ������ ���� �̷������ �� �Լ��� �ݺ����̱� ������ �ݺ����� ���� ���� �����̴�.
// �ٸ� ����� ����Ǯ�̸� ���� �����佺�׳׽��� ä�� ����� �Ѵ�. �̴� �Է°��� ������ �ȴٸ� �迭�� �Ҵ��� ���߹ݺ����� ���� �Ҽ� ���θ� �� ���� �Ǵ��ϸ� �ȴ�.
// ���� ���� �Է��� ���´ٸ� ���� ���� ������ �� �ʿ���� ���� ������ �� �� �ְ� ¥�� ���� ����ð��� ���̴� �ٽ�����Ʈ�̴�.
// �����佺�׳׽��� ���� ������ �Ѵٸ� �ð��� ����� ������ �Է� ���� ���� Ƚ����ŭ �迭 ���� ������ �� ������ ���� �ݺ����� ȣ���� �ȴ�.
// �̸� ���̱� ���� ī��Ʈ �迭�� �� �Ҵ��Ͽ� n������ �Ҽ��� ������ ������ ������ �迭�� �ʱ�ȭ�Ѵٸ� ���� ���� �Է��� ���͵� �� �迭�� ���� ������ �ϸ� �ȴ�.
// ���� �Է��� ������ �þ�� �þ���� ������ ����� �ξ� ������ ������ �˰����� �����Ͽ��� ���� 160ms�ۿ� �� �ɷȴ�. 
package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N1929 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		boolean[] arr = new boolean[1000001];
		arr[1] = true;
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		for(int i=2; i<=1000; i++) {
			int j=2;
			while(true) {
				arr[i*j] = true;
				j++;
				if(i*j > 1000000)
					break;
			}
		}
		for(int i=M; i<=N; i++) {
			if(arr[i] == false)
				bw.write(Integer.toString(i) + '\n');
		}
		bw.flush();
	}

}
// �� ������ �����佺�׳׽��� ä�� �̿��� Ǫ�� �����̱� ������ �������� �־��� ���� ������ 1000000������ �迭�� �Ҵ��ϰ� �ݺ����� ���ؼ� �Ҽ��� ������� true�� ���� �ʱ�ȭ���ش�.
// ���� M���� N���� �迭�� ������ false�� ��, �� �Ҽ��� ���� ����ϸ� �ȴ�. �׷��� ����ð��� 320ms�� �ð��� �ټ� �ҿ�ȴ�.
// �ٸ������ ����Ǯ�̸� ã�ƺ��� N���� �ް��� N ũ���� �迭�� �Ҵ��Ͽ� �ݺ����� ���� �����佺�׳׽��� ä�� �����Ѵ�. �̰� �� �� ȿ������ ������� �� �� �ִ�.
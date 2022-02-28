package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N1978 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int cnt = 0;
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(isPrime(num))
				cnt++;
		}
		System.out.println(cnt);
	}
	public static boolean isPrime(int num) {
		if(num == 1)	// 1�� �Ҽ��� �ƴ��� �ٽ� �˾Ҵ�.
			return false;
		for(int i=2; i<num/2+1; i++) {
			if(num%i == 0)
				return false;
		}
		return true;
	}

}
// �Ҽ����ϱ� ������ ������ Ǯ� ����� �־ ��������� ���� Ǯ����.�ٸ� ����� Ǯ�̸� ã�ƺ��� num�� �����ٱ��� �ݺ����� ���� ������� ������ ������������ �Ǻ��ϴ� ������� Ǯ����.
// ���� Ǭ ����� O(n)�� �ð����⵵������ �������� �̿��� ����� O(n^(1/2))����. �����δ� ������ ����� �̿��Ͽ��߰ڴ�.
// ���� ��, ���͵� �߿� ����̰� throws Exception�� ���� ������ �߾���. �� ������ Ǯ�� �ռ� ������ ���� �̿� ���� ã�ƺ� ���� ���ڴ�.
// ������ ���� �߻� ���� ó���� �ϱ� ���ؼ��� try catch ���� ���� ó���� ���ش�.
// �׷��� ��� �޼ҵ忡�� ���ܰ� �߻��� �ߴٸ� �� �޼ҵ� ������ ó���� �ϴ��� �޼ҵ带 ȣ���� �����ʿ��� ó���� �ϴ��Ŀ��� ���̰� �ִ�.
// ���� ���, main���� �ϳ��� �޼ҵ带 ���� �� ȣ�� �ߴٰ� ��������. �� �� �߻��ϴ� ������ ���ܿ� ���ؼ� ��� try catch finally���� �޼ҵ� �ȿ� ���Ǹ� �س��ƾ� �Ѵ�.
// �׷��� throws�� ���� ���ܸ� �޼ҵ带 ȣ���� ������ �Ѱ��ְ� �Ǹ� ȣ���� �ʿ��� ���� ó���� ���ָ� �ȴ�.
// ū �������� �޼ҵ� ������ ����ó���� ���ְ� �Ǹ� ���� �޼ҵ峪 main���� try���� �ִ� �ٸ� �޼ҵ尡 ȣ���� ������
// �޼ҵ忡�� throws�� ���� ���� �޼ҵ峪 main���� ����ó���� �̷��ְ� �Ǹ� try�� ������ ���ܰ� �߻��� ������ �Ǿ� try���� �ִ� �ٸ� �޼ҵ尡 ȣ����� �ʰ� catch�� ������ �ȴ�.
// ���� ���, ��ǰ�߼��̶�� �޼ҵ� ���� ����, ����������, �߼� �̶�� �޼ҵ尡 �ִٰ� �� �� ����, ����������, �߼� �� 1������� �����ϸ� �ٸ� �޼ҵ带 ��� ����ϰ� �ʹٰ� ����.
// �׷��� try�� �ȿ� ��� �޼ҵ带 �ְ� catch���� �������϶�� �ϸ� �ȴ�. �׷��� ����, ����������, �߼� �޼ҵ� ���� ����ó���� �Ǿ��ִٸ� ��� ��Ұ� ���� ���� ���̴�.
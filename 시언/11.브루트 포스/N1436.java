package baekjoon;
import java.io.*;
public class N1436 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(Find(N));
	}
	
	public static int Find(int N) {
		int cnt = 0;
		int ans = 0;
		String s;
		while(true) {
			ans++;
            s = Integer.toString(ans);
            if(s.contains("666")){
                cnt++;
            }
            if(cnt == N)
                break;
		}
		return ans;
	}

}
// �ҿ�ð�: 10�� + 20��(�˻��ϰ� ����)
// ó������ Integer -> String -> char[] �� ����, �ݺ����� ���� ���ڸ� �ϳ��� ���Ͽ� Ǯ��, �̸� �迭���� �����ߴ�.
// �ٵ�, OutOfIndexError�� �߻��߰�, �̴� �迭�� ����Ͽ��� �߻��� ��������.
// �˻��� �غ��� �ٸ� ������� �迭���ٰ� �׳� �������� �ʰ� ������ �����ϴ� ������ Ǯ����.
// ����, Integer -> String�ϰ� contains�Լ��� �׳� ����ϸ� �Ǵ� ��������.
// ������ Ǫ�� ���� �߿��Ѱ� �ƴ϶� ��� Ǫ�� ���� �� �߿��� �� ����.
// �ٸ� ������� �� ���� ��, ���������� �ľ��� �� �ֵ��� �Լ� ����̳� Ŭ�� �ڵ��� �� �� �Ű��߰ڴ�.
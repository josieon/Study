package baekjoon;
import java.io.*;
public class N11654 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char c = str.charAt(0);
		System.out.println((int)c);
	}
}
// �� ������ Ǯ�� ���� �ڹٿ����� �ƽ�Ű�ڵ������ �˾ƺôµ� Ÿ��ĳ������ �׳� �ϸ� �ƴ�.
// ������ �Ǽ��ϴ� �κ��� Ÿ��ĳ������ �� �� int(c)��� �߾��µ� (int)c��� �ؾ� Ÿ��ĳ������ �Ǵ� ���̴�.
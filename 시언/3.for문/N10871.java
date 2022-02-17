package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N10871 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		str = br.readLine();
		st = new StringTokenizer(str," ");
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(num < X)
				bw.write(num+" ");
		}
		bw.flush();
	}
/* �� ������ Ǯ�鼭 StringTokenizer�� ����Ͽ��µ�
 * StringTokenizer�� ���� ���е� String�� TypeCasting�ϴ� �Ͱ�
 * �� ���� ���ڿ��� �޾ƿ��ٺ��� BufferedReader�� readLine�� �� �� ȣ�����ְ� �Ǵµ�
 * �� ������ StringTokenzier�� �����ڸ� �ٽ� ȣ�����־�� �ϴ� ���� ���ŷο���.
 * StringTokenizer�� ���� �� �� �����غ� �ʿ䰡 �ִٰ� �����߰�
 * �ٸ� ����� �ڵ带 ���� �����ȿ� ���� �н��ؾ߰ڴ�.
 */
}

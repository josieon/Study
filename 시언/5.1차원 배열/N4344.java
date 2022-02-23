package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N4344 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int C = Integer.parseInt(br.readLine());
		for(int i=0; i<C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			float sum = 0;
			float[] Case = new float[N];
			for(int j=0; j<N; j++) {
				Case[j] = Float.parseFloat(st.nextToken()); 
				sum += Case[j];
			}
			float avg = sum / N;
			float cnt = 0;
			for(int j=0; j<N; j++) {
				if(Case[j] > avg)
					cnt++;
			}
			bw.write(String.format("%.3f",cnt/N*100)+"%\n");
		}
		bw.flush();
	}
/* ������ Ǯ�� ���� ������ �Ĳ��� ���� �Ѵ�. �̹� ������ �׷��� �ʾƼ� �� ���̳� Ʋ�ȴ�. �Է°� ��°��� ����� ��� ������ ���� Ÿ��ĳ���� �� ���� ������ �� ������.
 * �̹� ������ Ǯ�� ���� String.format �Լ��� ������ ���� �˻��غ��Ҵ�.
 */
}

package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N10250 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int n = N / H + 1;
			int h = N % H;
			if(N % H == 0) {
				h = H;
				n = N / H;
			}
			bw.write(h+padLeftZeros(Integer.toString(n),2)+"\n");
		}
		bw.flush();
	}
	
	public static String padLeftZeros(String inputString, int length) {
		if(inputString.length() >= length) {
			return inputString;
		}
		StringBuilder sb = new StringBuilder();
		while(sb.length() < length - inputString.length()) {
			sb.append('0');
		}
		sb.append(inputString);
		return sb.toString();
	}
}
//int�� String���� ��ȯ�ϴ� �� ������ �� ���� �˻��� �Ͽ� �� ������ Ǯ����.
//String���� ����� �Ϸ��� ���� ȣ���� 0�� �߰��ϴ� �͵� �߰������� �ڵ带 ã�ƺ��� Ǯ����. �̸� �е��̶�� �Ѵ�.
//�׷��� Ǯ���� ������ �ϴ� ���� ó���� �Ǿ���. �� ����ó���� �Ǵ��� �����غ��Ƶ� �������� �ʾƼ� �˻��� �غ��Ҵ�.
//N�� H�� ����϶��� ��츦 ����ó���� ������ �ʾƼ� �׷���. ���� ���, N�� 12�ε� H�� 6�̶�� ������ �˰����ζ�� 003ȣ�� �����Եȴ�. �̷��� ��츦 ����ó�� ���־���.
//�� Ǯ�� �ٸ� ����� Ǭ ���� ���Ҵµ� String���� ������� �ʰ� �׳� n�� h�� ���� ���� h*100+n�� ������ش�. �̷��� �ϸ� 0�� �е��� �� �ʿ䵵 ����.
//������ �ð��� 168ms �ٸ� ���ó�� Ǭ �ð��� 160ms����.
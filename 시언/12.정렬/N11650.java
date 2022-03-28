import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class N11650 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, (e1, e2) -> {
				if(e1[0] == e2[0]) {
					return e1[1] - e2[1];
				}
				else {
					return e1[0] - e2[0];
				}
		});
		for(int i=0; i<N; i++) {
			bw.write(Integer.toString(arr[i][0]) + ' ' + Integer.toString(arr[i][1]) + '\n');
		}
		bw.flush();
		bw.close();
	}

}

// public static <T> void sort(T[] a, Comparator<? super T> c)	sort�� �����̴�.
// T�� ��ü�� ���ϴµ� Ŭ����, ������Ʈ, �ڷ��� �� ��� Ÿ���̵� �������.
// �׷��� �� ���������� int[]�� T�� �Ͽ� T[]�� int[][]�� �ȴ�.
// Comparator�� ���� �ڷ����� ���ϴµ� ���⼭�� int[]�� �ȴ�.
// ���� �ڷ����� ��� ���ϳĴ� compare�Լ��� override ���־ �����ϰ� �Ǵµ�
// int[] �� int[]�� ���� �� �⺻�����δ� x��ǥ���� ���Ͽ� return�ϴµ� x��ǥ���� ������ ��쿡�� y��ǥ���� ���Ͽ� return�Ѵ�.
// ���� ���ٽ�(�����Լ�)���� ������ ����̰� ���ٽ��� �ƴ� ������� ���Ǹ� ���ڸ� �Ʒ��� ����.
// Arrays.sort(arr, new Comparator<int[]>() {
//		public int compare(int[] e1, int[] e2){
//			if(e1[0] == e2[0]){
//				return e1[1] - e2[1];
//			}
//			else {
//				return e1[0] - e2[0];
//			}
//	});
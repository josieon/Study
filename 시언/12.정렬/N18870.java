import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;
public class N18870 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] sorted = Arrays.copyOf(arr, N);
		Arrays.sort(sorted);
		int rank = 0;
		for(int v : sorted) {
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int key : arr) {
			sb.append(rankingMap.get(key)).append(' ');
		}
		System.out.println(sb);
	}

}
// �̹� ������ Ǯ�鼭 �ؽ����̶�� �ڷᱸ���� ���� ���� �Ǿ���.
// ������ �˰� �ִ� �ڷᱸ���̱� ������ �ڼ��� �˰� ������ �ʾҴ�.
// �̹��� ���� �ڷᱸ���� ���� ���θ� �ؾ� �ϴ� ������ ������.
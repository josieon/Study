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
// 이번 문제를 풀면서 해쉬맵이라는 자료구조에 대해 배우게 되었다.
// 기존에 알고 있던 자료구조이긴 했으나 자세히 알고 있지는 않았다.
// 이번을 계기로 자료구조에 대해 공부를 해야 하는 이유를 느꼈다.
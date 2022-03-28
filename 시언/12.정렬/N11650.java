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

// public static <T> void sort(T[] a, Comparator<? super T> c)	sort의 원형이다.
// T란 객체를 말하는데 클래스, 오브젝트, 자료형 등 어떠한 타입이든 상관없다.
// 그래서 이 문제에서는 int[]를 T로 하여 T[]가 int[][]가 된다.
// Comparator는 비교할 자료형을 말하는데 여기서는 int[]가 된다.
// 비교할 자료형을 어떻게 비교하냐는 compare함수를 override 해주어서 정의하게 되는데
// int[] 와 int[]를 비교할 때 기본적으로는 x좌표값을 비교하여 return하는데 x좌표값이 동일한 경우에는 y좌표값을 비교하여 return한다.
// 위는 람다식(임의함수)으로 구현한 경우이고 람다식이 아닌 방식으로 정의를 하자면 아래와 같다.
// Arrays.sort(arr, new Comparator<int[]>() {
//		public int compare(int[] e1, int[] e2){
//			if(e1[0] == e2[0]){
//				return e1[1] - e2[1];
//			}
//			else {
//				return e1[0] - e2[0];
//			}
//	});
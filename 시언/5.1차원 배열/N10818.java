package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
public class N10818 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(arr);
		bw.write(arr.get(0)+" "+arr.get(N-1));
		bw.flush();
	}
/* 위의 코드로 작성하여 제출하였더니 시간이 1116ms가 소요되었다. 생각보다 시간이 많이 나온 것 같아 다른 사람의 코드를 볼 필요가 있다는 생각이 든다*/
/* 다른 사람의 코드를 참고하였더니 ArrayList를 안 쓰고 java.util.Arrays의 Array 클래스의 sort함수를 호출한다. 그러나 이 때도 1108ms라는 시간이 소요되었기 때문에
 * 별 차이는 없다는 생각이 든다. 하지만 ArrayList나 Arrays를 사용하지 않고 그냥 max와 min 변수를 만드는 것이 가장 시간이 적다
 * 배열을 사용하는 경우에는 O(n^2)이지만 사용하지 않는 경우에는 O(n)이라고 한다. 하지만 본 문제는 1차원 배열을 이용하여 푸는 문제이기 때문에 위의 풀이가 옳다
 */
}

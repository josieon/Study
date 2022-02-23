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
/* 본 문제를 풀면서 StringTokenizer를 사용하였는데
 * StringTokenizer를 통해 구분된 String을 TypeCasting하는 것과
 * 두 행의 문자열을 받아오다보니 BufferedReader의 readLine을 두 번 호출해주게 되는데
 * 그 때마다 StringTokenzier의 생성자를 다시 호출해주어야 하는 점이 번거로웠다.
 * StringTokenizer에 대해 좀 더 공부해볼 필요가 있다고 생각했고
 * 다른 사람의 코드를 보며 개선안에 대해 학습해야겠다.
 */
/* 다른 사람들의 풀이를 보며 공부를 하였는데 내가 풀었던 방식이
 * 효율적인 방식이라고 소개가 되고 있다. 대신에 나는 readLine을 호출해서 변수에 값을 주는데 이를 생략하고
 * StringTokenizer 생성자의 인자로 readLine을 호출하면 실행시간과 메모리를 더 줄일 수 있다.
 */
}

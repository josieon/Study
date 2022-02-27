package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N2869 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int day = (V-A) / (A-B);
		int position = day * (A-B);
		while(position < V) {
			day++;
			position += A;
			if(position >= V)
				break;
			position -= B;
		}
		System.out.println(day);
	}
}
// 처음에는 day와 position을 0으로 초기화하여 제출했는데 시간초과가 나왔다. 그래서 초기화값 자체를 규정짓는게 반복문의 횟수를 줄이는 방법이라는 생각에 새로 초기화를 하였다.
// V를 A-B만큼 하루가 지날때마다 올라가는데 마지막날에는 A만큼만 올라가면 되기 때문에 V에서 A만큼 빼주는 남은 거리를 A-B만큼 나누어 day를 초기화해주고 position도 초기화해준다.
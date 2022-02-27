package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N1085 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int min = x;
		if(y < min)
			min = y;
		if(w-x < min)
			min = w-x;
		if(h-y < min)
			min = h-y;
		System.out.println(min);
	}
}
// 소요시간 5분, 너무 쉬운 문제라 좀 의아했다.
// if문으로 풀었는데 다른 사람들은 어떻게 풀었는지 궁금해서 보았더니 if문 아니면 Math.min을 사용하였다.
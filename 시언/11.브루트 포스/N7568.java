package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N7568 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][3];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = 1;
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(i == j)
					continue;
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					arr[i][2]++;
				}
			}
		}
		for(int i=0; i<N; i++) {
			sb.append(Integer.toString(arr[i][2]) + ' ');
		}
		System.out.println(sb);
	}

}
// 소요시간: 10분
// 문제가 단순 초기화 반복 및 반복문을 통한 비교여서 금방 풀었다. 이차원 배열을 이용해 키와 몸무게 뿐만 아니라 등수도 값을 넣었다.
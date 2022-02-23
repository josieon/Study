package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N4344 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int C = Integer.parseInt(br.readLine());
		for(int i=0; i<C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			float sum = 0;
			float[] Case = new float[N];
			for(int j=0; j<N; j++) {
				Case[j] = Float.parseFloat(st.nextToken()); 
				sum += Case[j];
			}
			float avg = sum / N;
			float cnt = 0;
			for(int j=0; j<N; j++) {
				if(Case[j] > avg)
					cnt++;
			}
			bw.write(String.format("%.3f",cnt/N*100)+"%\n");
		}
		bw.flush();
	}
/* 문제를 풀기 전에 문제를 꼼꼼히 봐야 한다. 이번 문제는 그렇지 않아서 두 번이나 틀렸다. 입력과 출력간의 관계와 출력 포맷을 보고 타입캐스팅 및 형식 지정을 잘 해주자.
 * 이번 문제를 풀기 위해 String.format 함수의 사용법에 대해 검색해보았다.
 */
}

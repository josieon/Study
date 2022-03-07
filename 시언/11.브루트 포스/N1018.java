package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N1018 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] arr = new char[N][M];
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			for(int j=0; j<M; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		int min = N*M;
		for(int i=0; i<N-7; i++) {
			for(int j=0; j<M-7; j++) {
				char[][] tmp = new char[8][8];
				for(int k=0; k<8; k++) {
					for(int m=0; m<8; m++) {
						tmp[k][m] = arr[i+k][j+m];
					}
				}
				int dump = check(tmp);
				if(min > dump)
					min = dump;
			}
		}
		System.out.println(min);
	}

	public static int check(char[][] arr) {
		int white = 0;
		int black = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(i % 2 == j % 2) {
					if(arr[i][j] == 'W')
						black++;
					else
						white++;
				}
				else {
					if(arr[i][j] == 'W')
						white++;
					else
						black++;
				}
			}
		}
		if(white < black)
			return white;
		else
			return black;
	}
}
// 소요시간: 1시간 이상
// 문제를 처음에 너무 어렵게 생각했다. 이번 문제를 풀면서 알게 된 점은 아래와 같다.
// 1. 자바에서 배열은 따로 슬라이싱 기능을 제공하지는 않는다. 함수호출을 통해 다른 배열로 copy하는식으로 가능하다.
//	그러나, 이 역시도 일차원배열만 가능하다. 이차원 이상일 경우에는 반복문을 통해 슬라이싱을 수행해야한다.
// 2. 연속된 String의 경우 character로 변환하는데에는 toChar함수가 제일 낫다. StringTokenizer로는 안 잘린다.
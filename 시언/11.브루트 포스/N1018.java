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
// �ҿ�ð�: 1�ð� �̻�
// ������ ó���� �ʹ� ��ư� �����ߴ�. �̹� ������ Ǯ�鼭 �˰� �� ���� �Ʒ��� ����.
// 1. �ڹٿ��� �迭�� ���� �����̽� ����� ���������� �ʴ´�. �Լ�ȣ���� ���� �ٸ� �迭�� copy�ϴ½����� �����ϴ�.
//	�׷���, �� ���õ� �������迭�� �����ϴ�. ������ �̻��� ��쿡�� �ݺ����� ���� �����̽��� �����ؾ��Ѵ�.
// 2. ���ӵ� String�� ��� character�� ��ȯ�ϴµ����� toChar�Լ��� ���� ����. StringTokenizer�δ� �� �߸���.
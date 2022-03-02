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
// �ҿ�ð�: 10��
// ������ �ܼ� �ʱ�ȭ �ݺ� �� �ݺ����� ���� �񱳿��� �ݹ� Ǯ����. ������ �迭�� �̿��� Ű�� ������ �Ӹ� �ƴ϶� ����� ���� �־���.
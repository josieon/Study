package baekjoon;
import java.io.*;
import java.util.ArrayList; 
public class N8958 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			int score = 0;
			int point = 1;
			String str = br.readLine();
			char[] arr = str.toCharArray();
			for(int j=0; j<str.length(); j++) {
				if(arr[j] == 'O') {
					score += point;
					point++;
				}
				else {
					point = 1;
				}
			}
			bw.write(score+"\n");
		}
		bw.flush();
	}
/* �� ������ Ǯ�鼭 String�� �迭�� �ٲٴ� �Ϳ� ���� �˻��� ���Ҵ�.*/
}

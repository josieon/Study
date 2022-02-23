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
/* ���� �ڵ�� �ۼ��Ͽ� �����Ͽ����� �ð��� 1116ms�� �ҿ�Ǿ���. �������� �ð��� ���� ���� �� ���� �ٸ� ����� �ڵ带 �� �ʿ䰡 �ִٴ� ������ ���*/
/* �ٸ� ����� �ڵ带 �����Ͽ����� ArrayList�� �� ���� java.util.Arrays�� Array Ŭ������ sort�Լ��� ȣ���Ѵ�. �׷��� �� ���� 1108ms��� �ð��� �ҿ�Ǿ��� ������
 * �� ���̴� ���ٴ� ������ ���. ������ ArrayList�� Arrays�� ������� �ʰ� �׳� max�� min ������ ����� ���� ���� �ð��� ����
 * �迭�� ����ϴ� ��쿡�� O(n^2)������ ������� �ʴ� ��쿡�� O(n)�̶�� �Ѵ�. ������ �� ������ 1���� �迭�� �̿��Ͽ� Ǫ�� �����̱� ������ ���� Ǯ�̰� �Ǵ�
 */
}

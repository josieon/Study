package baekjoon;
import java.util.Arrays;
import java.io.*;
public class N5622 {
	static String[] num2 = new String[]{"A","B","C"};
	static String[] num3 = new String[]{"D","E","F"};
	static String[] num4 = new String[]{"G","H","I"};
	static String[] num5 = new String[]{"L","K","J"};
	static String[] num6 = new String[]{"M","N","O"};
	static String[] num7 = new String[]{"R","Q","P","S"};
	static String[] num8 = new String[]{"T","U","V"};
	static String[] num9 = new String[]{"Y","X","W","Z"};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] c = str.toCharArray();
		int time = 0;
		for(int i=0; i<c.length; i++) {
			time += chartoTime(c[i]);
		}
		System.out.println(time);
	}
	
	public static int chartoTime(char c) {
		int N=0;
		if(Arrays.asList(num2).contains(Character.toString(c))) {
			N=3;
		}
		if(Arrays.asList(num3).contains(Character.toString(c))) {
			N=4;
		}
		if(Arrays.asList(num4).contains(Character.toString(c))) {
			N=5;
		}
		if(Arrays.asList(num5).contains(Character.toString(c))) {
			N=6;
		}
		if(Arrays.asList(num6).contains(Character.toString(c))) {
			N=7;
		}
		if(Arrays.asList(num7).contains(Character.toString(c))) {
			N=8;
		}
		if(Arrays.asList(num8).contains(Character.toString(c))) {
			N=9;
		}
		if(Arrays.asList(num9).contains(Character.toString(c))) {
			N=10;
		}
		return N;
	}
}
// �� ������ Ǯ�� �迭���� �� ���� �ִ��� ��ȸ�ϴ� ��� ��쿡 ���ؼ� if���� ���� Ǯ����. Ǯ�� ���� �ʹ� �ܼ��ϰ� Ǭ ������ �Ǳ����� �� ���ۿ� ã�ƺ���
// case���� ���� Ǭ ��찡 �־���. ���� Ǭ ��ĺ��� �޸������γ� ����ð������γ�(�Լ� ȣ���� �� ���� ���̶� ����ȴ�) �� ���ٰ� �Ǵܵȴ�. �׷��� ��� 8ms�ۿ� ���̰� �� ���� �Ѵ�.

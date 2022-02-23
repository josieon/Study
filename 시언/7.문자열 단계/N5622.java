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
// 본 문제를 풀고 배열에서 그 값이 있는지 조회하는 모든 경우에 대해서 if문을 통해 풀었다. 풀고 나서 너무 단순하게 푼 것인지 의구심이 들어서 구글에 찾아보니
// case문을 통해 푼 경우가 있었다. 내가 푼 방식보다 메모리적으로나 실행시간적으로나(함수 호출이 더 적을 것이라 예상된다) 더 낫다고 판단된다. 그러나 사실 8ms밖에 차이가 안 나긴 한다.

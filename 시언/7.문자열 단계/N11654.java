package baekjoon;
import java.io.*;
public class N11654 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char c = str.charAt(0);
		System.out.println((int)c);
	}
}
// 본 문제를 풀기 위해 자바에서의 아스키코드출력을 알아봤는데 타입캐스팅을 그냥 하면 됐다.
// 기존에 실수하던 부분이 타입캐스팅을 할 때 int(c)라고 했었는데 (int)c라고 해야 타입캐스팅이 되는 것이다.
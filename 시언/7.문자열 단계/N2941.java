package baekjoon;
import java.io.*;
public class N2941 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			if(i<str.length()-1 && str.charAt(i)=='c') {
				if(str.charAt(i+1)=='=' || str.charAt(i+1)=='-')
					i++;
			}
			else if(i<str.length()-1 && str.charAt(i)=='d') {
				if(str.charAt(i+1)=='-')
					i++;
				else if(i<str.length()-2 && str.charAt(i+1)=='z')
					if(str.charAt(i+2)=='=')
						i+=2;
			}
			else if(i<str.length()-1 && (str.charAt(i)=='l' || str.charAt(i)=='n')) {
				if(str.charAt(i+1)=='j')
					i++;
			}
			else if(i<str.length()-1 && str.charAt(i)=='s') {
				if(str.charAt(i+1)=='=')
					i++;
			}
			else if(i<str.length()-1 && str.charAt(i)=='z') {
				if(str.charAt(i+1)=='=')
					i++;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
// 이 문제를 풀면서 2번의 StringIndexOutOfBounds 오류와 5번의 오답이 나왔다.
// 테스트 케이스 및 알고리즘은 문제 그대로 짜서 다 옳게 나왔으나 생각 못한 예외가 있었던 것 같다.
// 처음에는 String을 char 배열로 바꾸어서 했으나 그럴 필요 없이 charAt 함수를 호출하면 되는 문제였다.
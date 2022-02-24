package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N10757 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String A = new String(st.nextToken());
		String B = new String(st.nextToken());
		String temp;
		if(A.length() < B.length()) {
			temp = A;
			A = B;
			B = temp;
		}	//긴 String이 A, 짧은 String이 B로 설정
		temp = "";
		int up = 0;
		int i;
		for(i=0; i<A.length(); i++) {
			int value;
			if(i < B.length()) {
				value = (int)A.charAt(A.length() - 1 - i) + (int)B.charAt(B.length() - 1 - i) - 48 + up;
				if(value > 57) {
					value -= 10;
					up = 1;
				}
				else
					up = 0;
			}
			else {
				value = (int)A.charAt(A.length() - 1 - i) + up;
				if(value > 57) {
					value -= 10;
					up = 1;
				}
				else
					up = 0;
			}
			temp += (char)value;
		}
		if(up == 1)
			temp += '1';
		for(i=0; i<temp.length(); i++)
			bw.write(temp.charAt(temp.length() - 1 - i));
		bw.flush();
	}

}
// 본 문제를 푸는데에 한시간을 소요하였다. 처음에는 long타입으로 받고자 했으나 문제에서 입력값의 범위가 10^10000까지이기에 long타입 역시 부족하다.
// 재범이와 승수가 String으로 받아서 adder를 구현해야한다고 하였다.
// 두 수를 각각 입력받아 String으로 받고 반복문을 통해 길이가 긴 문자열과 짧은 문자열로 판별해주었다.
// 긴 문자열의 길이만큼 반복문을 돌면서 짧은 문자열의 길이까지는 두 수의 각 자릿수 합을 구해주고 짧은 문자열의 길이를 넘어가면 긴 문자열을 그대로 문자열에 넣어준다.
// up이라는 변수를 할당해 자릿수 올림을 해주었다.
// 이번 문제를 통해 깨달은 점은 String을 charAt함수를 통해 접근할 때 끝 자리부터 접근을 해야함으로 직관적이지 못하다는 것이다. String.length()를 통해 마지막 자리부터 접근가능하다.
// 그리고 더하기 연산을 통해 String에 문자를 추가해줄때 index 0에 추가가 되는 것을 알 수 있었다. 그러므로 마지막에 반복문을 통해 String의 마지막 자리부터 접근해 출력을 해주는 것을 볼수있다.
// 다른 사람의 코드를 보니 크게 두 가지 방법으로 풀었다. 1. 배열을 이용, 2. BigInteger 클래스 이용
// 1번의 방법은 String으로 받은 다음 더 긴 String 자릿수만큼의 배열을 할당해 준 다음 맨 뒤 문자부터 역순으로 하나씩 저장한다. 그리고 더하기 연산 및 올림 연산을 반복문을 통해 수행
// 2번의 방법은 상당히 간단하다. String으로 값을 받고 BigInteger클래스의 add 함수를 호출해 푼다.
// 내가 푼 방법 : 240ms		1번 방법 : 136ms		2번 방법 : 268ms
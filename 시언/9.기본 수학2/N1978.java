package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N1978 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int cnt = 0;
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(isPrime(num))
				cnt++;
		}
		System.out.println(cnt);
	}
	public static boolean isPrime(int num) {
		if(num == 1)	// 1은 소수가 아님을 다시 알았다.
			return false;
		for(int i=2; i<num/2+1; i++) {
			if(num%i == 0)
				return false;
		}
		return true;
	}

}
// 소수구하기 문제는 예전에 풀어본 기억이 있어서 상대적으로 쉽게 풀었다.다른 사람의 풀이를 찾아보니 num의 제곱근까지 반복문을 통해 나누어보고 나누어 떨어지는지를 판별하는 방식으로 풀었다.
// 내가 푼 방식은 O(n)의 시간복잡도이지만 제곱근을 이용한 방식은 O(n^(1/2))였다. 앞으로는 후자의 방법을 이용하여야겠다.
// 지난 주, 스터디 중에 재범이가 throws Exception에 대해 질문을 했었다. 본 문제를 풀기 앞서 생각이 나서 이에 대해 찾아본 것을 적겠다.
// 기존에 오류 발생 예외 처리를 하기 위해서는 try catch 문을 통해 처리를 해준다.
// 그러나 어떠한 메소드에서 예외가 발생을 했다면 그 메소드 내에서 처리를 하느냐 메소드를 호출한 상위쪽에서 처리를 하느냐에서 차이가 있다.
// 예를 들어, main에서 하나의 메소드를 여러 번 호출 했다고 가정하자. 이 때 발생하는 수많은 예외에 대해서 모두 try catch finally문을 메소드 안에 정의를 해놓아야 한다.
// 그래서 throws를 통해 예외를 메소드를 호출한 쪽으로 넘겨주게 되면 호출한 쪽에서 예외 처리를 해주면 된다.
// 큰 차이점은 메소드 내에서 예외처리를 해주게 되면 상위 메소드나 main에서 try문에 있는 다른 메소드가 호출이 되지만
// 메소드에서 throws를 통해 상위 메소드나 main으로 예외처리를 미뤄주게 되면 try문 내에서 예외가 발생한 것으로 되어 try문에 있는 다른 메소드가 호출되지 않고 catch로 빠지게 된다.
// 예를 들어, 상품발송이라는 메소드 내에 포장, 영수증발행, 발송 이라는 메소드가 있다고 할 때 포장, 영수증발행, 발송 중 1가지라고 실패하면 다른 메소드를 모두 취소하고 싶다고 하자.
// 그러면 try문 안에 모든 메소드를 넣고 catch문에 모두취소하라고 하면 된다. 그러나 포장, 영수증발행, 발송 메소드 내에 예외처리가 되어있다면 모두 취소가 되지 않을 것이다.
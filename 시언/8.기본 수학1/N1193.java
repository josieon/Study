package baekjoon;
import java.io.*;
public class N1193 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum=0;
		int range=1;
		while(sum < N) {
			sum += range;
			range++;
		}
		if(range%2!=0) {
			System.out.println((N-((range*(range-1))/2-range+1))+"/"+(range-((N-((range*(range-1))/2-range+1)))));
		}
		else {
			System.out.println(range-((N-((range*(range-1))/2-range+1)))+"/"+(N-((range*(range-1))/2-range+1)));
		}
	}
}
//	1/1
//	1/2	2/1
//	3/1	2/2	1/3
//	1/4	2/3	3/2	4/1
//	5/1	4/2	3/3	2/4	1/5
//	1/6	2/5	3/4	4/3	5/2	6/1
//위를 토대로 규칙을 보면 1일 때는 두 수의 합이 2, 2일 때는 두 수의 합이 3 이런식으로 idx+1 임을 알 수 있고,
//idx가 홀수일때는 1이 뒤에, idx가 짝수일때는 1이 앞에서부터 시작하는 것을 확인 할 수 있다.
//N이 입력되면 1차적으로 반복문을 통해 idx가 몇인지 알아낼 수 있다.
//N이 몇 번째 층(idx)에 있다는 것을 알고 나면 위와 같은 규칙대로 출력만 하면 된다.

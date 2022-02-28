package baekjoon;
import java.io.*;
public class N2775 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(func(k, n));
		}
	}
	public static int func(int k, int n) {
		if(k==0)
			return n;
		else {
			int sum = 0;
			for(int i=1; i<n+1; i++) {
				sum += func(k-1,i); 
			}
			return sum;
		}
	}

}
// 본 문제에서 수열처럼 규칙을 찾아 풀려고 하였으나 조화수열과 같은 형태였다. 식이 상당히 복잡해질 것으로 예상되어서 recursion을 사용하고자 했다.
// k층 n호의 인원을 구하기 위해서는 k-1층 1호부터 n호까지 인원을 더하면 되었기에 반복문을 통해 sum이라는 변수에 값을 계속 더해주는 것을 확인할 수 있다.(general case)
// k가 0, 즉 0층에서는 n호에 n명의 인원이 살고있기 때문에 n명을 return해준다.(base case)
// 이렇게 문제를 풀면서 떠오른 생각은 상당히 직관적으로 풀긴 하였으나, 동일한 함수가 여러 번 호출되는 문제가 발생한다는 것이다.
// 예를 들어, func(5,4)의 경우 sum값이 func(4,1) + func(4,2) + func(4,3) + func(4,4)가 되는데
// func(4,3)의 경우 func(3,1) + func(3,2) + func(3,3)
// func(4,4)의 경우 func(3,1) + func(3,2) + func(3,3) + func(3,4)
// 보면 func(3,1), func(3,2), func(3,3)이 중복되어 두 번씩 호출하는 경우가 발생했다.
// 시간을 보면 416ms가 소요되는데 이러한 방법을 개선하면 위와 같은 문제가 해결될것이다. 따라서 본 문제는 recursion으로 풀기에 부적합하다.
// 다른 사람의 풀이를 보면 이차원 배열을 이용해 푼다. 단순하게 푼다면 이차원 배열이 훨씬 적합할 것으로 보인다.
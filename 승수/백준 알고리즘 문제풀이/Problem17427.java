import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 문제의 규칙을 찾지 못할때는 한번 계속 적어보는것도 방법
// 문제에서 나오는 그대로의 방법으로 계산시키면 시간초과할 가능성이 높음
/*
 * n이하 k를 약수로 갖는 수의 개수 = n이하의 k의 배수들

이라고 바꿔풀면, n이하 k의 배수들은 n/k가 된다.

ex) 100이하 11의 배수들 -> 11,22,33,44,55,66,77,88,99 총 9개 = 100/11

나머지도 동일하다.

따라서 1부터 n까지의 n/i 값을 모두 더하면, 답이 나온다.
 */
public class Problem17427{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long gx = 0;
		
		
		gx += FunctionF(N);
		
		System.out.println(gx);
		
	}
	public static long FunctionF(int x)
	{
		long fx = 0;
		for(int i=1;i<=x;i++)
		{
			fx += i*(x/i);
		}
		return fx;
	}
	
}

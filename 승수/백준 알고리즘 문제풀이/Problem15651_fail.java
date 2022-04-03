import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//백트래킹 문제이다. 이를 해결하기 위해서 DFS를 사용했다.
//이전의 문제와 다른점은 중복을 허용하기때문에 숫자를 사용했는지 체크할 필요가 없이 재귀함수를 이용해서 문제를 풀수있다.
//그러나 채점결과 시간초과 발생
public class Problem15651_fail {
	static int[] arr;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		
		Function(N,M,0);
		
	}
	
	public static void Function(int N, int M, int depth)
	{
		if(depth == M)
		{
			for(int val : arr)
			{
				System.out.print(val + " ");
			}
			System.out.println();
		}
		else
		{
			for(int i=1;i<=N;i++)
			{
				arr[depth] = i;
				Function(N,M,depth+1);
			}
		}
	}
}

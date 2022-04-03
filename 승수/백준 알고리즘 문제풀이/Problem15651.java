import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//��Ʈ��ŷ �����̴�. �̸� �ذ��ϱ� ���ؼ� DFS�� ����ߴ�.
//������ ������ �ٸ����� �ߺ��� ����ϱ⶧���� ���ڸ� ����ߴ��� üũ�� �ʿ䰡 ���� ����Լ��� �̿��ؼ� ������ Ǯ���ִ�.
public class Problem15651 {
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		
		Function(N,M,0);
		System.out.println(sb);
	}
	
	public static void Function(int N, int M, int depth)
	{
		if(depth == M)
		{
			for(int val : arr)
			{
				sb.append(val).append(" ");
			}
			sb.append('\n');
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

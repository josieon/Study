import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//��Ʈ��ŷ �����̴�. �̸� �ذ��ϱ� ���ؼ� DFS�� ����ߴ�.
//������ ������ �ٸ����� �ߺ��� ����ϱ⶧���� ���ڸ� ����ߴ��� üũ�� �ʿ䰡 ���� ����Լ��� �̿��ؼ� ������ Ǯ���ִ�.
//�׷��� ä����� �ð��ʰ� �߻�
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

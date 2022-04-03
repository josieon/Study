import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem15650 {
	static boolean[] checker;
	static int arr[];
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		checker = new boolean[N];
		arr = new int[M];
		
		Function(N,M,0,0);
	}
	
	public static void Function(int N, int M, int depth, int start_number)
	{
		if(depth == M)
		{
			for(int i=0;i<M;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		else
		{
			for(int i=start_number;i<N;i++)
			{
				if(checker[i] == false)
				{
					checker[i] = true;
					arr[depth] = i +1;
					Function(N,M,depth+1, i+1);
					
					checker[i] = false;
				}
			}
		}
	}
}

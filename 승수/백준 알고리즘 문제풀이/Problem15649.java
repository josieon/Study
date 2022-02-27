import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem15649 {
	static boolean[] clear;
	static int[] arr;
	public static void main(String[] args) throws IOException
	{
		int N, M;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		clear = new boolean[N];
		arr = new int[M];
		
		Function(N, M, 0);
	}
	
	public static void Function(int N, int M, int depth)
	{
		if(depth == M)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		else
		{
			for(int i=0;i<N;i++)
			{
				if(clear[i] == false)
				{
					clear[i] =true;
					arr[depth] = i+1;
					Function(N, M, depth+1);
					
					clear[i] = false;
				}
				else
					continue;
			}
		}
	}
}

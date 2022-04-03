import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem10828 {
	static int index;
	static int[] stack;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		index = N;
		stack = new int[N+1];
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			if(str.equals("push"))
			{
				push(Integer.parseInt(st.nextToken()), stack);
			}
			else if(str.equals("pop"))
			{
				pop(stack);
			}
			else if(str.equals("size"))
			{
				size(N);
			}
			else if(str.equals("empty"))
			{
				empty(N);
			}
			else if(str.equals("top"))
			{
				top(stack, N);
			}
			else
				continue;
		}
		
	}
	
	static void push(int x, int[] stack)
	{
		index--;
		stack[index] = x;
	}
	
	static void pop(int[] stack)
	{
		if(stack[index] == 0)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(stack[index]);
			stack[index] = 0;
			index++;
		}	
	}
	
	static void size(int N)
	{
		System.out.println(N-index);
	}
	
	static void empty(int N)
	{
		if(N == index)
			System.out.println(1);
		else
			System.out.println(0);
	}
	
	static void top(int[] stack, int N)
	{
		if(N == index)
			System.out.println(-1);
		else
			System.out.println(stack[index]);
	}
	
}

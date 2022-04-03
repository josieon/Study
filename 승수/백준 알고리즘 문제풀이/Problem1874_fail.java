import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
//문제의 예시들은 다 풀리나 틀린 이유를 모르겠다...
public class Problem1874_fail {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int number = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		int j=1;
		
		for(int i=1;i<=number;i++)
		{
			queue.add(Integer.parseInt(br.readLine()));
		}
		while(!queue.isEmpty())
		{
			if(j==1)
			{
				stack.push(j);
				sb.append("+").append('\n');
				j++;
			}
			else if(j==number+2)
			{
				break;
			}
			else
			{
				if(!stack.empty())
				{
					if(stack.peek() == queue.peek())
					{
						stack.pop();
						queue.poll();
						sb.append("-").append('\n');
					}
					else
					{
						if(j!=number+1)
						{
							stack.push(j);
							sb.append("+").append('\n');
						}
						j++;
					}
				}
				else
				{
					if(j!=number+1)
					{
						stack.push(j);
						sb.append("+").append('\n');
					}
					j++;
				}
			}
		}
		if(queue.isEmpty())
			System.out.println(sb);
		else
			System.out.println("NO");
	}
}

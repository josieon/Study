import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
//시간초과 발생
//queue에 집어 넣고 빼는 과정이 시간을 많이 잡아 먹는거 같음
public class Problem17298_fail {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int number = Integer.parseInt(br.readLine());
		boolean flag = false;
		Queue<Integer> queue = new LinkedList<Integer>();
		Queue<Integer> queue2 = new LinkedList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens())
		{
			queue.add(Integer.parseInt(st.nextToken()));
		}
		for(int i=0;i<number;i++)
		{
			if(i == number -1)
				sb.append(-1);
			if(!flag)
			{
				int standard = queue.poll();
				while(!queue.isEmpty())
				{
					int bank = queue.poll();
					if(standard < bank)
					{
						sb.append(bank).append(" ");
						queue2.add(bank);
						while(!queue.isEmpty())
						{
							queue2.add(queue.poll());
						}
						flag = !flag;
					}
					else
					{
						queue2.add(bank);
						if(queue.isEmpty())
						{
							sb.append(-1).append(" ");
							flag = !flag;
						}
					}
				}
			}
			else
			{
				int standard = queue2.poll();
				while(!queue2.isEmpty())
				{
					int bank = queue2.poll();
					if(standard < bank)
					{
						sb.append(bank).append(" ");
						queue.add(bank);
						while(!queue2.isEmpty())
						{
							queue2.add(queue2.poll());
						}
						flag = !flag;
					}
					else
					{
						queue.add(bank);
						if(queue2.isEmpty())
						{
							sb.append(-1).append(" ");
							flag = !flag;
						}
					}
				}
			}
		}
		System.out.println(sb);
	}
}
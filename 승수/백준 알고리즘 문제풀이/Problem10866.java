import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem10866 {
	public static void main(String[] args) throws IOException
	{
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new ArrayDeque<Integer>();
		int number = Integer.parseInt(br.readLine());
		for(int i=0;i<number;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken())
			{
			case "push_front" :
				deque.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back" :
				deque.addLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front" :
				if(deque.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(deque.pollFirst()).append('\n');
				break;
			case "pop_back" :
				if(deque.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(deque.pollLast()).append('\n');
				break;
			case "size" :
				sb.append(deque.size()).append('\n');
				break;
			case "empty" :
				if(deque.isEmpty())
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
				break;
			case "front" :
				if(deque.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(deque.peekFirst()).append('\n');
				break;
			case "back" :
				if(deque.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(deque.peekLast()).append('\n');
				break;
			default :
				break;
			}
		}
		System.out.print(sb);
	}
}

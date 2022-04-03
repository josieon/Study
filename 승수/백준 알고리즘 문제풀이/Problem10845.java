import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem10845{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int number = Integer.parseInt(br.readLine());
		int last = 0;
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0;i<number;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
			case "push" :
				last = Integer.parseInt(st.nextToken());
				queue.add(last);
				break;
			case "pop" : 
				if(queue.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(queue.poll()).append('\n');
				break;
			case "size" :
				sb.append(queue.size()).append('\n');
				break;
			case "empty" :
				if(queue.isEmpty())
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
				break;
			case "front" : 
				if(queue.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(queue.peek()).append('\n');
				break;
			case "back" :
				if(queue.isEmpty())
					sb.append(-1).append('\n');
				else
					sb.append(last).append('\n');
			}
		}
		System.out.print(sb);
		
	}
}
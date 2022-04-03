//Stack을 사용하는것과 어쩔때 push를 하고 어쩔때 pop을 하는지 까지는 맞힘
//그러나 어쩔때 마다 막대의 개수를 늘려야하는지 부분에서 막혔음
import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10799 {
	public static void main(String[] args) throws IOException
	{
		String arr = new String();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;
		arr = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<arr.length();i++)
		{
			if(arr.charAt(i) == '(')
			{
				stack.push(arr.charAt(i));
			}
			else
			{
				stack.pop();
				if(arr.charAt(i-1) == '(')
					total += stack.size();
				else
					total++;
			}
		}
		System.out.print(total);
	}
}

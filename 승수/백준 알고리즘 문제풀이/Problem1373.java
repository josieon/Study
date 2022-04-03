import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Problem1373 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		String str2 = br.readLine();
		StringBuffer sb = new StringBuffer(str2);
		str2 = sb.reverse().toString();
		int total = 0;
		int count = 0;
		for(int i=0;i<str2.length();i++)
		{
			
			if(str2.charAt(i) == '1')
			{
				total = total + (int)Math.pow(2, count);
			}
			count++;
			if(count ==3)
			{
				stack.push(total);
				count = 0;
				total = 0;
			}
			if(i == str2.length()-1 && count!=0)
			{
				stack.push(total);
			}
		}
		while(!stack.empty())
		{
			System.out.print(stack.pop());
		}
	}
}

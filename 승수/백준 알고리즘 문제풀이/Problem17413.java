import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problem17413 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int flag1 = 0;
		int flag2 = 0;
		Stack<Character> stack1 = new Stack<Character>();
		String str = br.readLine();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '<')
			{
				while(!stack1.empty())
				{
					sb.append(stack1.pop());
				}
				flag1++;
			}
			else if(str.charAt(i) == '>')
			{
				sb.append(str.charAt(i));
				flag2++;
			}
			if(flag1 == flag2 && str.charAt(i) != '>' && str.charAt(i) != ' ')
			{
				stack1.push(str.charAt(i));
			}
			if(flag1 == flag2 && str.charAt(i) == ' ')
			{
				while(!stack1.empty())
				{
					sb.append(stack1.pop());
				}
				sb.append(" ");
			}
			else if(flag1!=flag2)
			{
				sb.append(str.charAt(i));
			}
			if(i == str.length() -1 )
			{
				while(!stack1.empty())
					sb.append(stack1.pop());
			}
		}
		System.out.println(sb);
	}
}


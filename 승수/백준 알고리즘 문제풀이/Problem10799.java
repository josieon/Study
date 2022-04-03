//Stack�� ����ϴ°Ͱ� ��¿�� push�� �ϰ� ��¿�� pop�� �ϴ��� ������ ����
//�׷��� ��¿�� ���� ������ ������ �÷����ϴ��� �κп��� ������
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

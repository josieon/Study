import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//���� ǥ����� ������ �̿��ϸ� �ȴ�.
public class Problem1935 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int chartonumber[] = new int[number];
		String str = new String();
		str = br.readLine();
		Stack<Double> stack = new Stack<Double>();
		for(int i=0;i<number;i++) //ABC ��� ���ĺ��� �����ϴ� ���ڸ� ����ϴ� ��� �ƽ�Ű �ڵ带 Ȱ���Ѵ�
		{
			chartonumber[i] = Integer.parseInt(br.readLine());
		}
		//���� ǥ����� ��� ���ڰ� ���� ���ÿ� �ְ� �����ڰ� ���� ������ ���� a,b�� ������ b ������ a �� ���� �̸� �ٽ� ���ÿ� �ִ´�.
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65&&str.charAt(i)<=90)
			{
				stack.push((double)chartonumber[str.charAt(i) - 65]); // �ε����� ���ĺ�-65 �ƽ�Ű �ڵ带 Ȱ���Ѵ�
			}
			else
			{
				double pop1 = stack.pop();
				double pop2 = stack.pop();
				if(str.charAt(i) == '-')
				{
					stack.push(pop2 - pop1);
				}
				else if(str.charAt(i) == '+')
				{
					stack.push(pop2 + pop1);
				}
				else if(str.charAt(i) == '*')
				{
					stack.push(pop2 * pop1);
				}
				else if(str.charAt(i) == '/')
				{
					stack.push(pop2 / pop1);
				}
			}
		}
		System.out.printf("%.2f",stack.pop());
	}

}

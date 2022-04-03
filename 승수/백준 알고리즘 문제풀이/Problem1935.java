import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//후위 표기식은 스택을 이용하면 된다.
public class Problem1935 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int chartonumber[] = new int[number];
		String str = new String();
		str = br.readLine();
		Stack<Double> stack = new Stack<Double>();
		for(int i=0;i<number;i++) //ABC 등등 알파벳에 대응하는 숫자를 기록하는 방법 아스키 코드를 활용한다
		{
			chartonumber[i] = Integer.parseInt(br.readLine());
		}
		//후위 표기식의 방법 숫자가 오면 스택에 넣고 연산자가 오면 스택의 상위 a,b를 꺼내서 b 연산자 a 를 한후 이를 다시 스택에 넣는다.
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65&&str.charAt(i)<=90)
			{
				stack.push((double)chartonumber[str.charAt(i) - 65]); // 인덱스는 알파벳-65 아스키 코드를 활용한다
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

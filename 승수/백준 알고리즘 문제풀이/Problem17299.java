import java.util.Stack;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
//17298번 문제와 사실 동일한 문제
//stack을 사용하자
public class Problem17299 {
	public static void main(String[] args) throws IOException
	{
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] numof_num = new int[1000001];
		int[] num_arr = new int[number+1];
		for(int i=1;i<=number;i++)//숫자 받기 및 숫자의 개수 새기
		{
			num_arr[i] = Integer.parseInt(st.nextToken());
			numof_num[num_arr[i]]++;
		}
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=1;i<=number;i++)
		{
			while(!stack.empty()&&numof_num[num_arr[stack.peek()]]<numof_num[num_arr[i]])
			{
				num_arr[stack.pop()] = num_arr[i];
			}
			stack.push(i);
		}
		while(!stack.empty())
		{
			num_arr[stack.pop()] = -1;
		}
		for(int i=1;i<=number;i++)
		{
			sb.append(num_arr[i]).append(" ");
		}
		System.out.print(sb);
	}
}

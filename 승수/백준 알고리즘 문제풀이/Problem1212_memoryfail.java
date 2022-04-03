import java.util.Queue;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problem1212_memoryfail {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<Integer>();
		String str1 = br.readLine();
		String str2 = new String();
		StringBuffer sb = new StringBuffer(str1);
		str1 = sb.reverse().toString();
		
		for(int i=0;i<str1.length();i++)
		{
			int number = Integer.parseInt(Character.toString(str1.charAt(i)));
			number = (int)Math.pow(8, i) *number;
			while(true)
			{
				if(number/2==1)
				{
					queue.add(number%2);
					queue.add(1);
					break;
				}
				else
				{
					queue.add(number%2);
					number = number / 2;
				}
			}
			for(int j=0;j<3*i;j++)
				queue.poll();
			if(i == str1.length()-1)
				while(!queue.isEmpty())
				{
					str2 = str2 + Integer.toString(queue.poll());
				}
			else
			{
				if(queue.size()==1)
				{
					str2 = str2 + Integer.toString(queue.poll());
					str2 = str2 + '0';
					str2 = str2 + '0';
				}
				else if(queue.size()==2)
				{
					str2 = str2 + Integer.toString(queue.poll());
					str2 = str2 + Integer.toString(queue.poll());
					str2 = str2 + '0';
				}
				else
					while(!queue.isEmpty())
					{
						str2 = str2 + Integer.toString(queue.poll());
					}
			}
		}
		sb = new StringBuffer(str2);
		str2 = sb.reverse().toString();
		System.out.print(str2);
	}
}

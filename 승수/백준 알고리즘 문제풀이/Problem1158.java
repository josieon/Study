import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
//시간 초과 발생 //
//예상은 했으나 다른 방법이 생각이 안남
public class Problem1158 {
	public static void main(String[] args) throws IOException
	{
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int number = Integer.parseInt(st.nextToken());
		int divisor = number;
		int jump = Integer.parseInt(st.nextToken());
		int index = jump-1;
		LinkedList<Integer> link = new LinkedList<Integer>();
		sb.append("<");
		for(int i=0;i<number;i++)
		{
			link.add(i+1);
		}
		for(int i=0;i<number;i++)
		{
			if(i == number -1)
				sb.append(link.get(index)).append(">");
			else
			{
				sb.append(link.get(index)).append(", ");
				divisor--;
				link.remove(index);
				index = ((index-1)+3)%divisor;
			}
		}
		System.out.println(sb);
	}	
}

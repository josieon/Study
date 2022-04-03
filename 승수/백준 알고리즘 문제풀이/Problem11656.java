import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
//String의 함수 subString을 이용하면 문자열을 잘라낼수 있음
public class Problem11656 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		ArrayList<String> array = new ArrayList<String>();
		for(int i=0;i<str.length();i++)
		{
			array.add(str.substring(i));
		}
		Collections.sort(array);
		
		for(int i=0;i<array.size();i++)
		{
			sb.append(array.get(i)).append('\n');
		}
		System.out.print(sb);
	}
}

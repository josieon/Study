import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
//String�� �Լ� subString�� �̿��ϸ� ���ڿ��� �߶󳾼� ����
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

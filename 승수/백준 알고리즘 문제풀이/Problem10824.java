import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//���� �������� ������ ���� 
//long�� ����ؼ� �ذ�
//long�� ������ ��� ��� BigInteger class�� ����ؼ� ������ �ذ��ؾ���  
public class Problem10824 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String str1 = st.nextToken() + st.nextToken();
		String str2 = st.nextToken() + st.nextToken();
		long a = Long.parseLong(str1);
		long b = Long.parseLong(str2);
		long total = a + b;
		System.out.println(total);
	}
}

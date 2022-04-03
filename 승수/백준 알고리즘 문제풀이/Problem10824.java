import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
//숫자 데이터의 범위를 생각 
//long을 사용해서 해결
//long의 범위를 벗어날 경우 BigInteger class를 사용해서 문제를 해결해야함  
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

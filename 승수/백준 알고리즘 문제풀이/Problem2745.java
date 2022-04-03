import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Problem2745 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuffer sb = new StringBuffer(st.nextToken());
		int total = 0;
		char a;
		int zinsu = Integer.parseInt(st.nextToken());
		String str1 = sb.reverse().toString();
		for(int i=0;i<str1.length();i++)
		{
			a = str1.charAt(i);
			if(a<65) //자리수가 숫자로 표현된 경우 0이 아스키 코드로 48이기때문에 48을 빼준다 혹은 '0'을 빼주어도 괜찮다
			{
				total = total + (a-48)* (int)Math.pow((double)zinsu, i);
			}
			else //자리수가 알파벳인경우 A가 아스키 코드로 65이기대문에 A는 숫자 10에 매칭하기 위해서 55를 빼준다 혹은 'A'를 빼주어도 괜찮다.
			{
				int j = a - 55;
				total = total +j * (int)Math.pow((double)zinsu, i);
			}
		}
		System.out.print(total);
	}
	
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//나의 틀린 답안 이렇게 하면 나중에는 int의 범위를 넘어가게 되서 높은 수에서는 사용할수 없게된다.
/*
 * int 는 4byte 크기

4byte 는  4 x 8bit = 32bit

즉, 2^32 = 2의 32제곱 만큼의 크기 표현 가능

 2^32 = 2^(10*10*10*4) = 1024*1024*1024*4 = 4,294,967,296 만큼 표현가능

절반은 양수, 절반은 음수를 가르키므로 

양수의 최대값은 2,147,483,647 으로 10자리를 넘는 값을 표현 할 수 없다.
 */
public class Problem4375_mysolution_fail {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String str2 = br.readLine();
			String str1;
			if(str2 == null)
				break;
			int number = Integer.parseInt(str2);
			int count = 1;
			int flag = 0;
			Line1 :
			while(true)
			{
				str1 = Integer.toString(number*count);
				for(int i=0;i<str1.length();i++)
				{
					if(str1.charAt(i) == '1')
					{
						if(i == str1.length()-1)
						{
							flag = 1;
							break Line1;
						}
						continue;
					}
					else
						break;
				}
				count++;
			}
			if(flag == 1)
			{
				System.out.println(str1);
				System.out.println(str1.length());
			}
		}
	}
}

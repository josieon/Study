import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//���� Ʋ�� ��� �̷��� �ϸ� ���߿��� int�� ������ �Ѿ�� �Ǽ� ���� �������� ����Ҽ� ���Եȴ�.
/*
 * int �� 4byte ũ��

4byte ��  4 x 8bit = 32bit

��, 2^32 = 2�� 32���� ��ŭ�� ũ�� ǥ�� ����

 2^32 = 2^(10*10*10*4) = 1024*1024*1024*4 = 4,294,967,296 ��ŭ ǥ������

������ ���, ������ ������ ����Ű�Ƿ� 

����� �ִ밪�� 2,147,483,647 ���� 10�ڸ��� �Ѵ� ���� ǥ�� �� �� ����.
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

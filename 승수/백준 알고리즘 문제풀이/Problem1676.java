import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
//���丮�� ����� ���� ���ڿ��� �ٲ㼭 �ڿ��� ���� 0�� � �ִ��� ��������
public class Problem1676 {
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		BigInteger total = new BigInteger("1");
		int count = 0;
		for(int i=1;i<=number;i++)
		{
			total = total.multiply(new BigInteger(Integer.toString(i)));
		}
		String str = total.toString();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i) == '0')
			{
				count++;
			}
			else
				break;
		}
		System.out.println(count);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//����� ���ϴ� ��� : 1. N�� �������� ���Ѵ�
//2. 1���� �����ٱ��� N�� ����� ���Ѵ�.
//N�� 1~������ ������ ����� �������� ����� �ȴ�.
public class Problem17427_fail2{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int gx = 0;
		
		for(int i=1;i<=N;i++)
		{
			gx += FunctionF(i);
		}
		System.out.println(gx);
		
	}
	public static int FunctionF(int x)
	{
		int fx = 0;
		for(int i=1;i<=Math.sqrt(x);i++)
		{
			if(x%i == 0)
			{
				if(i!=x/i)
				{
					fx += i+x/i;
				}
				else
				{
					fx += i;
				}
			}
		}
		return fx;
	}
	
}

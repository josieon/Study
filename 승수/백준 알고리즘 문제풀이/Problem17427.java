import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// ������ ��Ģ�� ã�� ���Ҷ��� �ѹ� ��� ����°͵� ���
// �������� ������ �״���� ������� ����Ű�� �ð��ʰ��� ���ɼ��� ����
/*
 * n���� k�� ����� ���� ���� ���� = n������ k�� �����

�̶�� �ٲ�Ǯ��, n���� k�� ������� n/k�� �ȴ�.

ex) 100���� 11�� ����� -> 11,22,33,44,55,66,77,88,99 �� 9�� = 100/11

�������� �����ϴ�.

���� 1���� n������ n/i ���� ��� ���ϸ�, ���� ���´�.
 */
public class Problem17427{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long gx = 0;
		
		
		gx += FunctionF(N);
		
		System.out.println(gx);
		
	}
	public static long FunctionF(int x)
	{
		long fx = 0;
		for(int i=1;i<=x;i++)
		{
			fx += i*(x/i);
		}
		return fx;
	}
	
}

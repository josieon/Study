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
			if(a<65) //�ڸ����� ���ڷ� ǥ���� ��� 0�� �ƽ�Ű �ڵ�� 48�̱⶧���� 48�� ���ش� Ȥ�� '0'�� ���־ ������
			{
				total = total + (a-48)* (int)Math.pow((double)zinsu, i);
			}
			else //�ڸ����� ���ĺ��ΰ�� A�� �ƽ�Ű �ڵ�� 65�̱�빮�� A�� ���� 10�� ��Ī�ϱ� ���ؼ� 55�� ���ش� Ȥ�� 'A'�� ���־ ������.
			{
				int j = a - 55;
				total = total +j * (int)Math.pow((double)zinsu, i);
			}
		}
		System.out.print(total);
	}
	
}

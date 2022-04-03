import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11005 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int tenzinsu = Integer.parseInt(st.nextToken());
		int number = Integer.parseInt(st.nextToken());
		while(true)
		{
			int namuzi = tenzinsu % number;
			tenzinsu = tenzinsu / number; //������ ������ ���� ���� 
			if(namuzi>=10) // ���� �������� 10���� ũ�� �ƽ�Ű �ڵ带 �̿��ؼ� ���ڷ� ��ȯ
			{
				sb.append((char)(namuzi+55));	
			}
			else // �������� 10���� ������ �ʸ����� �״�� �������
			{
				sb.append(namuzi);
			}
			if(tenzinsu / number == 0 && tenzinsu!=0) //��ȯ�ϴ� ������ ���������� ���� ���� 0�� �ȴٸ� ���� ����
			{
				if(tenzinsu>=10) // ���� 10���� ũ�� ���ڷ�
				{
					sb.append((char)(tenzinsu+55));	
				}
				else
				{
					sb.append(tenzinsu); //���� 10���� ������ �״��
				}
				break;
			}
			else if(tenzinsu == 0)
				break;
		}
		System.out.print(sb.reverse());
	}
}

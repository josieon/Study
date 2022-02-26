import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem10757_2 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String str1 = st.nextToken();
		String str2 = st.nextToken(); //���� �迭�� ���ڸ� ��������
		
		int max_length = Math.max(str1.length(), str2.length());
		int[]A = new int[max_length+1];
		int[]B = new int[max_length+1]; //�� ������ ����Ÿ� max�� ��� �̺��� 1ũ�� int�迭����(1ũ�� �ϴ������� �ΰ� �������� �ڸ����� �þ�� ����
		
		for(int i=str1.length()-1, idx=0;i>=0;i--, idx++) // ���ڸ� �ű��� �ֱ�!! �̰� �ٸ��� �ִ°ͺ��� �ξ� ����
		{
			A[idx] = str1.charAt(i) - '0';
			B[idx] = str2.charAt(i) - '0';
		}
		
		for(int i=0;i<max_length;i++)//���� ����
		{
			int value = A[i] +B[i];
			A[i] = value%10;
			A[i + 1] += value/10;
		}
		
		StringBuilder sb = new StringBuilder();
		if(A[max_length] != 0) { //���⼭ if���� ������ �Ǿ��������� 0�ΰ�쿡�� 0�� ���̴°� �̻���
			sb.append(A[max_length]);
		}
		for(int i = max_length-1; i>=0;i--)
		{
			sb.append(A[i]);
		}
		System.out.println(sb);
	}
}

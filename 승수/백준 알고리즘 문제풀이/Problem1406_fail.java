import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
//ArrayList�� �޼ҵ带 �����ؾ��ϴ¹���
//�ð��ʰ�
public class Problem1406_fail {
	static int cusor; //Ŀ�� ��ġ Ŀ����ġ�� arrayList ũ��� ���� 0 1 2 3 �ε��� �̸� 4�� ��
	static ArrayList<Character> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		int count;
		for(int i=0;i<str1.length();i++)
		{
			arr.add(str1.charAt(i)); //ArrayList�� ���ڸ� ����
		}
		cusor = str1.length();
		count = Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); //���̽� �з�
			switch(st.nextToken()) {
			case "L": 
				insertL();
				break;
			case "D":
				insertD();
				break;
			case "B":
				insertB();
				break;
			case "P":
				insertP(st.nextToken().toCharArray()[0]);
				break;
			default:
				break;
			}
		}
		for(int i=0;i<arr.size();i++)
		{
			System.out.print(arr.get(i));
		}
	}
	
	public static void insertL() //L�ϴ�
	{
		if(cusor != 0) //�Ǿ������� �ƴϸ�
		{
			cusor --;//Ŀ�� ũ�� 1���̱�
		}
	}
	
	public static void insertD()
	{
		if(cusor != arr.size()) //Ŀ�� ũ�Ⱑ �ƽ��� �ƴϸ�
		{
			cusor++; //1 �ø�
		}
	}
	
	public static void insertB()
	{
		if(cusor == 0) //Ŀ���� 0�̸� �ƹ��͵� ����
			return;
		else
		{
			arr.remove(cusor-1); //0�� �ƴϸ� Ŀ�� ������ ����
			cusor--;
		}
	}
	public static void insertP(char data)
	{
		arr.add(cusor, data); // Ŀ���� ���ʿ� ������ ����ֱ� ���� Ŀ���� ��ġ�� 3�̸� 3��ġ�� ���ڴ� 4�� �з����� ���ο� ���ڴ� 3���� �����Ѵ�.
		cusor++;
	}
}

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Stack;
import java.util.StringTokenizer;
//ArrayList�� ����ϴ� �ð��ʰ� �߻�
//Stack�� �������
//StringBuilder�� ����ϴ°� �ξ� �ð� ȿ������
public class Problem1406 {
	static Stack<Character> arr = new Stack<>(); //Ŀ������ ���� ����
	static Stack<Character> arr2 = new Stack<>(); //Ŀ������ ������ ����
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		int count;
		for(int i=0;i<str1.length();i++)
		{
			arr.push(str1.charAt(i)); //Ŀ�� ���� ���� ���ÿ� ���ڸ� ����
		}
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
		while(!arr.empty()){
            arr2.push(arr.pop());
        }
        StringBuilder sb = new StringBuilder();
        while (!arr2.empty()){
            sb.append(arr2.pop());
        }
        System.out.println(sb.toString());
	}
	
	public static void insertL() //L�϶� ���� ������ ������ �������ÿ� �ֱ�
	{
		if(arr.empty()) // ���� ������ ��������� �ƹ��͵� ����
			return;
		else
		{
			arr2.push(arr.pop());
		}
	}
	
	public static void insertD()
	{
		if(arr2.empty()) //������ ������ ��������� �ƹ��͵� ����
			return;
		else
			arr.push(arr2.pop()); //������ ������ ���� ���� ���ÿ� ����
	}
	
	public static void insertB()
	{
		if(arr.empty()) //���� ������ ������� �ƹ��͵� ����
			return;
		else
		{
			arr.pop(); //���� ���ÿ� ������ ����
		}
	}
	public static void insertP(char data)
	{
		arr.push(data); //���� ���ÿ� ����ֱ�
	}
}

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
//ArrayList의 메소드를 공부해야하는문제
//시간초과
public class Problem1406_fail {
	static int cusor; //커서 위치 커서위치는 arrayList 크기와 같다 0 1 2 3 인덱스 이면 4로 함
	static ArrayList<Character> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		int count;
		for(int i=0;i<str1.length();i++)
		{
			arr.add(str1.charAt(i)); //ArrayList에 문자를 넣음
		}
		cusor = str1.length();
		count = Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); //케이스 분류
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
	
	public static void insertL() //L일대
	{
		if(cusor != 0) //맨앞지리가 아니면
		{
			cusor --;//커서 크기 1줄이기
		}
	}
	
	public static void insertD()
	{
		if(cusor != arr.size()) //커서 크기가 맥스가 아니면
		{
			cusor++; //1 늘림
		}
	}
	
	public static void insertB()
	{
		if(cusor == 0) //커서가 0이면 아무것도 안함
			return;
		else
		{
			arr.remove(cusor-1); //0이 아니면 커서 왼쪽을 지움
			cusor--;
		}
	}
	public static void insertP(char data)
	{
		arr.add(cusor, data); // 커서의 왼쪽에 데이터 집어넣기 만약 커서의 위치가 3이면 3위치의 문자는 4로 밀려나고 새로운 문자는 3으로 들어가야한다.
		cusor++;
	}
}

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Stack;
import java.util.StringTokenizer;
//ArrayList를 사용하니 시간초과 발생
//Stack을 사용하자
//StringBuilder를 사용하는게 훨씬 시간 효율적임
public class Problem1406 {
	static Stack<Character> arr = new Stack<>(); //커서기준 왼쪽 스택
	static Stack<Character> arr2 = new Stack<>(); //커서기준 오른쪽 스택
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		int count;
		for(int i=0;i<str1.length();i++)
		{
			arr.push(str1.charAt(i)); //커서 기준 왼쪽 스택에 문자를 넣음
		}
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
		while(!arr.empty()){
            arr2.push(arr.pop());
        }
        StringBuilder sb = new StringBuilder();
        while (!arr2.empty()){
            sb.append(arr2.pop());
        }
        System.out.println(sb.toString());
	}
	
	public static void insertL() //L일때 왼쪽 스택의 내용을 오론쪽택에 넣기
	{
		if(arr.empty()) // 왼쪽 스택이 비어있으면 아무것도 안함
			return;
		else
		{
			arr2.push(arr.pop());
		}
	}
	
	public static void insertD()
	{
		if(arr2.empty()) //오른쪽 스택이 비어있으면 아무것도 안함
			return;
		else
			arr.push(arr2.pop()); //오른쪽 스택의 값을 왼쪽 스택에 넣음
	}
	
	public static void insertB()
	{
		if(arr.empty()) //왼쪽 스택이 비엇으면 아무것도 안함
			return;
		else
		{
			arr.pop(); //왼쪽 스택에 내용을 꺼냄
		}
	}
	public static void insertP(char data)
	{
		arr.push(data); //왼쪽 스택에 집어넣기
	}
}

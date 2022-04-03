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
			tenzinsu = tenzinsu / number; //나숫셈 연산의 몫을 갱신 
			if(namuzi>=10) // 만약 나머지가 10보다 크면 아스키 코드를 이용해서 문자로 변환
			{
				sb.append((char)(namuzi+55));	
			}
			else // 나머지가 10보다 작으면 너머지를 그대로 넣으면됨
			{
				sb.append(namuzi);
			}
			if(tenzinsu / number == 0 && tenzinsu!=0) //변환하는 진수로 나누었을때 몫이 이제 0이 된다면 몫을 넣음
			{
				if(tenzinsu>=10) // 몫이 10보다 크면 문자로
				{
					sb.append((char)(tenzinsu+55));	
				}
				else
				{
					sb.append(tenzinsu); //몫이 10보다 작으면 그대로
				}
				break;
			}
			else if(tenzinsu == 0)
				break;
		}
		System.out.print(sb.reverse());
	}
}

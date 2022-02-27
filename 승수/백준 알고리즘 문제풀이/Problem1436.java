import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problem1436 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int number = Integer.parseInt(br.readLine());
		String str = new String();
		str = "666";
		while(true)
		{
			if(str.contains("666"))
			{
				count++;
				if(count == number)
					break;
			}
			str = Integer.toString(Integer.parseInt(str) +1);
		}
		System.out.print(str);
	}

}

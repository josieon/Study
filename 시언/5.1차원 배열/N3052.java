package baekjoon;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class N3052 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList();
		for(int i=0; i<10; i++) {
			int num = Integer.parseInt(br.readLine()) % 42;
			if(!arr.contains(num))
				arr.add(num);
		}
		System.out.println(arr.size());
	}

}

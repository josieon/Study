package baekjoon;
import java.io.*;
import java.util.ArrayList;
public class N1065 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=1; i<=N; i++) {
			if(hannumber(i))
				cnt++;
		}
		System.out.println(cnt);
	}
	public static boolean hannumber(int x) {
		if(x<100)
			return true;
		ArrayList<Integer> arr = new ArrayList();
		while(true) {
			arr.add(x%10);
			x=x/10;
			if(x==0)
				break;
		}
		int gap = arr.get(0) - arr.get(1);
		for(int i=1; i<arr.size()-1; i++) {
			if(gap != (arr.get(i) - arr.get(i+1)))
				return false;
		}
		return true;
	}
}

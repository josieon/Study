package baekjoon;
import java.io.*;
public class N1316 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0; i<N; i++) {
			if(checker(br.readLine()))
				cnt++;
		}
		System.out.println(cnt);
	}
	public static boolean checker(String str) {
		int[] idx = new int[26];
		String arr=new String();
		for(int i=0; i<str.length(); i++) {
			if(i==0)
				arr = arr + str.charAt(i);
			else {
				if(str.charAt(i) != arr.charAt(arr.length()-1))
					arr = arr + str.charAt(i);
			}
		}
		for(int i=0; i<arr.length(); i++) {
			if(idx[(int)arr.charAt(i)-97]==0)
				idx[(int)arr.charAt(i)-97]=1;
			else
				return false;
		}
		return true;
	}

}

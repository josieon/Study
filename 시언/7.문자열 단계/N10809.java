package baekjoon;
import java.io.*;
public class N10809 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[26];
		for(int i=0; i<26; i++)
			arr[i] = -1;
		char[] str = br.readLine().toCharArray();
		for(int i=0; i<str.length; i++) {
			if(arr[(int)str[i]-97] == -1)
				arr[(int)str[i]-97] = i;
		}
		for(int i=0; i<26; i++)
			bw.write(arr[i]+" ");
		bw.flush();
	}

}

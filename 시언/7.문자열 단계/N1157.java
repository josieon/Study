package baekjoon;
import java.io.*;
public class N1157 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toUpperCase().toCharArray();
		int[] cnt = new int[26];
		for(int i=0; i<str.length; i++) {
			cnt[(int)str[i]-65]++;
		}
		int max=0;
		int idx=0;
		for(int i=0; i<26; i++) {
			if(max < cnt[i]) {
				max = cnt[i];
				idx = i;
			}
		}
		for(int i=0; i<26; i++) {
			if(i==idx)
				continue;
			if(max == cnt[i]) {
				System.out.println("?");
				return;
			}
		}
		System.out.println((char)(idx+65));
	}

}

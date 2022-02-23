package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N2908 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		char[] A = st.nextToken().toCharArray();
		char[] B = st.nextToken().toCharArray();
		for(int i=2; i>=0; i--) {
			if((int)A[i]>(int)B[i]) {
				System.out.println(reverse(A));
				break;
			}
			if((int)B[i]>(int)A[i]) {
				System.out.println(reverse(B));
				break;
			}
		}
	}
	public static char[] reverse(char[] c) {
		char[] r = new char[c.length];
		for(int i=0; i<c.length; i++) {
			r[i]=c[c.length-i-1];
		}
		return r;
	}

}

package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N10951 {

	public static void main(String[] args) throws Exception{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while(true) {
			str = br.readLine();
			if(str == null)
				break;
			StringTokenizer st = new StringTokenizer(str," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		bw.flush();
	}

}

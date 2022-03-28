import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
public class N1181 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String e1, String e2) {
				if(e1.length() == e2.length())
					return e1.compareTo(e2);
				else
					return e1.length() - e2.length();
			}
		});
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0] + '\n');
		for(int i=1; i<N; i++) {
			if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i] + '\n');
			}
		}
		System.out.println(sb);
	}

}

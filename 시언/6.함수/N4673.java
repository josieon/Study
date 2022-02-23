package baekjoon;
import java.io.*;
public class N4673 {

	public static void main(String[] args) throws Exception{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[10001];
		for(int i=1; i<10001; i++) {
			if(arr[i] == 0) {
				int a = i;
				while(true) {
					int b = d(a);
					if(b > 10000)
						break;
					arr[b] = 1;
					a = b;
				}
			}
		}
		for(int i=1; i<10001; i++)
			if(arr[i]==0)
				bw.write(i+"\n");
		bw.flush();
	}
	public static int d(int n) {
		int sum = n;
		while(true) {
			if(n==0)
				break;
			sum += n%10;
			n = n/10;
		}
		return sum;
	}

}

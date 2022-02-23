package baekjoon;
import java.util.Scanner;
public class N2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a==b && a==c) {
			System.out.println(1000*a+10000);
		}
		else if(a==b || a==c || b==c) {
			int same=0;
			if(a==b)
				same=b;
			if(a==c)
				same=c;
			if(b==c)
				same=c;
			System.out.println(1000+same*100);
		}
		else {
			int max=a;
			if(max<b)
				max=b;
			if(max<c)
				max=c;
			System.out.println(max*100);
		}
	}

}

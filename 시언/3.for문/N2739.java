package baekjoon;
import java.util.Scanner;
public class N2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1; i<10; i+=1) {
			System.out.println(num +" * "+i+" = "+num*i);
		}
	}

}

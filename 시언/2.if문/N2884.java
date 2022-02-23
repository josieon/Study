package baekjoon;
import java.util.Scanner;
public class N2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		if(min < 45) {
			hour = (hour-1) % 24;
			min = min + 15;
			if(hour < 0)
				hour = 23;
		}
		else
			min = min - 45;
		
		System.out.println(hour+" "+min);
	}

}

package baekjoon;
import java.util.Scanner;
public class N2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		min = min + time%60;
		if(min >= 60) {
			min = min%60;
			hour += 1;
		}
		hour = (hour + time/60)%24;
		System.out.println(hour+" "+min);
	}

}

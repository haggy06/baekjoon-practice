package level_2;

import java.util.Scanner;

public class Main_2525 {

	public static void main(String[] args) {
		int hour, min, time, T_hour, T_min;
		
		Scanner scan = new Scanner(System.in);
		hour = scan.nextInt();
		min = scan.nextInt();
		time = scan.nextInt();
		scan.close();
		
		T_hour = time / 60;
		T_min = time % 60;
		
		hour += T_hour;
		min += T_min;
		
		if ( min >= 60 ) {
			min -= 60;
			hour++;
		}
		hour = hour % 24;
		
		System.out.print( hour + " " + min );
	}
}

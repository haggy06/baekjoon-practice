package level_2;

import java.util.Scanner;

public class Main_2884 {

	public static void main(String[] args) {
		int hour, min;
		
		Scanner scan = new Scanner(System.in);
		hour = scan.nextInt();
		min = scan.nextInt();
		scan.close();
		
		if ( min < 45 ) {
			min += 15;
			hour--;
			
			if ( hour < 0 ) {
				hour += 24;
			}
		}
		else {
			min -= 45;
		}
		
		System.out.print( hour + " " + min );
	}
}

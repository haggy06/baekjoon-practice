package level_2;

import java.util.Scanner;

public class Main_2753 {

	public static void main(String[] args) {
		int year, num = 0;
		
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		scan.close();
		
		if ( year % 4 == 0 ) if ( year % 100 != 0 || year % 400 == 0 ) num++;
		
		System.out.print( num );
	}
}

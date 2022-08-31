package level_2;

import java.util.Scanner;

public class Main_14681 {

	public static void main(String[] args) {
		int x, y;
		
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		scan.close();
		
		if ( x > 0 && y > 0 ) System.out.print( "1" );
		else if ( x < 0 && y > 0 ) System.out.print( "2" );
		else if ( x < 0 && y < 0 ) System.out.print( "3" );
		else if ( x > 0 && y < 0 ) System.out.print( "4" );
	}
}

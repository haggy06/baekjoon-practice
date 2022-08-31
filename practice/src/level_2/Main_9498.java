package level_2;

import java.util.Scanner;

public class Main_9498 {

	public static void main(String[] args) {
		int A;
		
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		scan.close();
		
		if ( A >= 90 ) System.out.print( "A" );
		else if ( A >= 80 ) System.out.print( "B" );
		else if ( A >= 70 ) System.out.print( "C" );
		else if ( A >= 60 ) System.out.print( "D" );
		else System.out.print( "F" );
	}
}

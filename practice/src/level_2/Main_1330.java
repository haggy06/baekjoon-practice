package level_2;

import java.util.Scanner;

public class Main_1330 {

	public static void main(String[] args) {
		int A, B;
		
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		scan.close();
		
		if ( A == B )System.out.print( "==" );
		else if ( A < B )System.out.print( "<" );
		else if ( A > B )System.out.print( ">" );
	}
}

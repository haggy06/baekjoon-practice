package level_3;

import java.util.Scanner;

public class Main_25304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt(), N = scan.nextInt(), a, b, T = 0;
		
		for ( int i = 0; i < N; i++ ) {
			a = scan.nextInt();
			b = scan.nextInt();
			T += a * b;
		}
		scan.close();
		
		if ( T == X ) System.out.print( "Yes" );
		else System.out.print( "No" );
	}
}

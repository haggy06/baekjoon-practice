package level_3;

import java.util.Scanner;

public class Main_2439 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		for ( int i = 1; i <= N; i++ ) {
			for ( int j = N; j > i; j-- ) System.out.print( " " );
			for ( int j = 0; j < i; j++ ) System.out.print( "*" );
			System.out.println( "" );
		}
	}
}

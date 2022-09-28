package level_5;

import java.util.Scanner;

public class Main_1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, fin = scan.nextInt();
		scan.close();
		for ( int i = 1; i <= fin; i++ ) {
			if ( i < 100 ) num++;
			else if ( judge( i ) == true ) num++;
		}
		System.out.print( num );
	}
	
	public static boolean judge( int n ) {
		String Ns = Integer.toString( n );
		int dif = ( Ns.charAt(0) - Ns.charAt(1) );
		for (int i = 1; i < Ns.length(); i++) {
			if ( dif != ( Ns.charAt(i - 1) - Ns.charAt(i) ) ) return false;
		}
		return true;
	}
	
}

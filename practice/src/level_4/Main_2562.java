package level_4;

import java.util.Scanner;

public class Main_2562 {

	public static void main(String[] args) {
		int[] list = new int[ 9 ];
		
		Scanner scan = new Scanner(System.in);
		list[ 0 ] = scan.nextInt();
		int L = list[ 0 ], num = 1;
		for ( int i = 1; i < 9; i++ ) {
			list[ i ] = scan.nextInt();
			if ( L < list[ i ] ) {
				L = list[ i ];
				num = i + 1;
			}
		}
		System.out.print( L + "\n" + num );
	}
}

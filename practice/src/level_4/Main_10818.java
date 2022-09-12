package level_4;

import java.util.Scanner;

public class Main_10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int[] list = new int[ A ];
		
		list[ 0 ] = scan.nextInt();
		int S = list[ 0 ], L = list[ 0 ];
		for ( int i = 1; i < A; i++ ) {
			list[ i ] = scan.nextInt();
			if ( list[ i ] < S ) S = list[ i ];
			if ( list[ i ] > L ) L = list[ i ];
		}
		System.out.print( S + " " + L );
	}
}

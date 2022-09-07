package level_3;

import java.util.Scanner;

public class Main_10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(), X = scan.nextInt();
		int[] list = new int[N];
		
		for ( int i = 0; i < N; i++ ) {
			list[i] = scan.nextInt();
		}
		scan.close();
		for ( int i : list ) if ( i < X ) System.out.println( i );
	}
}

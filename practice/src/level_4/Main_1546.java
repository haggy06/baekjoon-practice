package level_4;

import java.util.Scanner;

public class Main_1546 {

	public static void main(String[] args) {
		float T = 0, B;
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
		int[] grade = new int[L];
		
		grade[0] = scan.nextInt();
		B = grade[0];
		for ( int i = 1; i < L; i++ ) {
			grade[i] = scan.nextInt();
			if ( B < grade[i] ) B = grade[i];
		}
		scan.close();
		for ( int i = 0; i < L; i++ ) {
			T += (grade[i] / B) * 100.0;
		}
		float num = T / L;
		System.out.print( num );
	}
}

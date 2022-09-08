package level_3;

import java.util.Scanner;

public class Main_1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		int a, b, X = N, S = 0;
		
		while ( N != X ) {
			b = X % 10;
			a = X / 10;
			X = a + b;
			X = X % 10 + b * 10;
			S++;
		}
		System.out.print( S );
	}
}

package level_3;

import java.util.Scanner;

public class Main_11021 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(), A, B, sum;
		
		for( int i = 1; i <= num; i++ ) {
			A = scan.nextInt();
			B = scan.nextInt();
			sum = A + B;
			System.out.println( "Case #" + i + ": " + sum );
		}
		scan.close();
	}
}

package level_3;

import java.util.Scanner;

public class Main_10950 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt(), A, B;
		
		for ( int i = 0; i < num; i++ ) {
			A = scan.nextInt();
			B = scan.nextInt();
			System.out.println( A + B );
		}
		scan.close();
	}
}

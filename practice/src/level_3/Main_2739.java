package level_3;

import java.util.Scanner;

public class Main_2739 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.close();
		
		for ( int i = 1; i <= 9; i++ ) System.out.println( N + " * " + i + " = " + i*N );
	}
}

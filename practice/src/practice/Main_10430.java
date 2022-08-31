package practice;

import java.util.Scanner;

public class Main_10430 {

	public static void main(String[] args) {
		int A, B, C;
		
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		scan.close();
		
		System.out.println( ( A + B ) % C );
		System.out.println( ( ( A % C ) + ( B % C ) ) % C );
		System.out.println( ( A * B ) % C );
		System.out.println( ( ( A % C ) * ( B % C ) ) % C );
	}
}

package level_2;

import java.util.Scanner;

public class Main_2480 {

	public static void main(String[] args) {
		int A, B, C, answer;
		
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		scan.close();
		
		if ( A == B || B == C || C == A ) {
			if ( A == B && B == C && C == A ) answer = 10000 + A * 1000;
			else if  ( A == B ) answer = 1000 + A * 100;
			else answer = 1000 + C * 100;
		}
		
		else {
			if ( A < B ) {
				if ( B < C ) answer = C * 100;
				else answer = B * 100;
			}
			else if ( A > C )answer = A * 100;
			else answer = C * 100;
		}
		System.out.print( answer );
	}
}
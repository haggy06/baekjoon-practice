package practice;

import java.util.Scanner;

public class Main_1008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A, B;
		
		A = scan.nextInt();
		B = scan.nextInt();
		scan.close();
			
		System.out.print(A / B);
	}
}
package practice;

import java.util.Scanner;

public class Main_10869 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A, B;
		
		A = scan.nextInt();
		B = scan.nextInt();
		scan.close();
			
		
		System.out.println (A + B);
		System.out.println (A - B);
		System.out.println (A * B);
		System.out.println (A / B);
		System.out.println (A % B);
	}
}
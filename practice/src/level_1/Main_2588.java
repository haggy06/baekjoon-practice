package level_1;

import java.util.Scanner;

public class Main_2588 {
	
	public static void main(String[] args) {
		int A;
		String B;
		int[] BB = new int[3];
		
		Scanner scan = new Scanner(System.in);
		A = scan.nextInt();
		B = scan.next();
		scan.close();
		
		int IntB = Integer.parseInt(B);
		
		String[] B_split = B.split("");
		
		for ( int i = 0; i < 3; i++ ) BB[i] = Integer.parseInt(B_split[i]);
		
		for ( int i = 2; i >= 0; i-- ) System.out.println( A * BB[i] );
		System.out.print( A * IntB );
	}
}

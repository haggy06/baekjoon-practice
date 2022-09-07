package level_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_10952 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		int A, B;
		
		Scanner scan = new Scanner(System.in);
		
		while ( true ) {
			A = scan.nextInt();
			B = scan.nextInt();
			
			if ( A == B && A == 0 ) break;
			
			arr.add(A + B);
		}
		scan.close();
		
		for (int i : arr) System.out.println( i );
	}
}

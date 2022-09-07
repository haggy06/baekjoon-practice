package level_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_10952 {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		int A, B;
		
		Scanner scan = new Scanner(System.in);
		
		while ( true ) {
			A = scan.nextInt();
			B = scan.nextInt();
			int sum = A+B;
			
			arr.add(sum);
		}
		
		for (int i : arr) {
			System.out.println( i );
		}
			
	}
}

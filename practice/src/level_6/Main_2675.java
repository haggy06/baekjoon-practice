package level_6;

import java.util.Scanner;

public class Main_2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(), cycle;
		String word;
		
		for ( int i = 0; i < N; i++ ) {
			cycle = scan.nextInt();
			
			word = scan.next();
			String[] list = new String[word.length()];
			list = word.split("");
			
			for ( String j : list ) for ( int ii = 0; ii < cycle; ii++ ) System.out.print(j);
			
			System.out.println("");
		}
		
		scan.close();
	}
}

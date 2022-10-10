package level_6;

import java.util.Scanner;

public class Main_10809 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String N = scan.next();
		scan.close();
		int[] alphabet = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		
		for (int i = 0; i < N.length(); i++) {
			if ( alphabet[N.charAt(i) - 'a'] == -1 ) alphabet[N.charAt(i) - 'a'] = i;
		}
		
		for ( int i : alphabet ) System.out.print( i + " " );
	}
}

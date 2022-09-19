package level_4;

import java.util.Scanner;

public class Main_8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int L = scan.nextInt(), N = 0;
		String list;
		int ans = 0;
		String[] cul = new String[80];
		
		for ( int i = 0; i < L; i++ ) {
			list = scan.next();
			cul = list.split("");
			for ( String j : cul ) {
				if ( j.equals("O") ) {
					N++;
					ans += N;
				}
				else if ( j.equals("X") ) N = 0;
			}
			 System.out.println( ans );
			 ans = 0;
			 N = 0;
		}
		scan.close();
	}
}

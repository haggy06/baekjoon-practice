package level_6;

import java.util.Scanner;

public class Main_11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt(), ans = 0;
		String num = scan.next();
		scan.close();
		
		String[] list = new String[len];
		list = num.split("");
		
		for ( String i : list ) {
			ans += Integer.valueOf( i );
		}
		System.out.print( ans );
	}
}

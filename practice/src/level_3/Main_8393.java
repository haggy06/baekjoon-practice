package level_3;

import java.util.Scanner;

public class Main_8393 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), num = 0;
		scan.close();
		
		for ( int i =1; i <= n; i++ ) num += i;
		System.out.print( num );
	}
}

package level_4;

import java.util.Scanner;

public class Main_4344 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int L = scan.nextInt(), l;
			float f, a = 0, b = 0;
			for ( int i = 0; i < L; i++ ) {
				l = scan.nextInt();
				int[] list = new int[l];
				for ( int j = 0; j < l; j++ ) {
					list[j] = scan.nextInt();
					a += list[j];
				}
				a = a / l;
				for ( int j : list ) if ( j > a ) b++;
				f = b * 100 / l ;
				System.out.printf("%.3f%%\n", f);
				a = 0;
				b = 0;
			}
			scan.close();
	}
}
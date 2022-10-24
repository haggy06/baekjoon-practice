package level_6;

import java.util.Scanner;

public class Main_1152 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.nextLine();
		scan.close();
		
		String[] n = N.split(" ");
		int a = 0;
		for ( String i : n ) if ( !i.equals("") ) a++;
		
		System.out.print(a);
	}
}

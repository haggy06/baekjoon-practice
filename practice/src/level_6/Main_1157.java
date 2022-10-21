package level_6;

import java.util.Scanner;

public class Main_1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.next().toUpperCase();
		scan.close();
		int a = 1, AA = 0, aa = 0;
		
		int [] countList = new int[26];
		
		for (int i = 0; i < N.length(); i++) {
			countList[( N.charAt(i) ) - 'A']++;
		}
		for ( int i = 0; i < 26; i++ ) {
			if ( countList[i] != 0 && aa <= countList[i] ) {
				AA = aa;
				a = i;
				aa = countList[i];
			}
		}
		if ( aa == AA ) System.out.print("?");
		else System.out.print( (char)(65 + a) );
	}
}
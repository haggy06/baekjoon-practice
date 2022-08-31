package level_1;

import java.util.Scanner;

public class Main_3003 {

	public static void main(String[] args) {
		int K, Q, R, B, N, P;
		int K_num = 0, Q_num = 0, R_num = 0, B_num = 0, N_num = 0, P_num = 0;
		
		Scanner scan = new Scanner(System.in);
		K = scan.nextInt();
		Q = scan.nextInt();
		R = scan.nextInt();
		B = scan.nextInt();
		N = scan.nextInt();
		P = scan.nextInt();
		scan.close();
		
		while ( K != 1 || Q != 1 || R != 2 || B != 2 || N != 2 || P != 8 ) { 
			if ( K < 1 ) {
				K_num++;
				K++;
			}
			else if ( K > 1 ) {
				K_num--;
				K--;
			}
			
			if ( Q < 1 ) {
				Q_num++;
				Q++;
			}
			else if ( Q > 1 ) {
				Q_num--;
				Q--;
			}
			
			if ( R < 2 ) {
				R_num++;
				R++;
			}
			else if ( R > 2 ) {
				R_num--;
				R--;
			}
			
			if ( B < 2 ) {
				B_num++;
				B++;
			}
			else if ( B > 2 ) {
				B_num--;
				B--;
			}
			
			if ( N < 2 ) {
				N_num++;
				N++;
			}
			else if ( N > 2 ) {
				N_num--;
				N--;
			}
			
			if ( P < 8 ) {
				P_num++;
				P++;
			}
			else if ( P > 8 ) {
				P_num--;
				P--;
			}
		}
		
		System.out.print( K_num + " " + Q_num + " " + R_num + " " + B_num + " " + N_num + " " + P_num );
	}
}

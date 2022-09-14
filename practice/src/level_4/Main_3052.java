package level_4;

import java.util.Scanner;

public class Main_3052 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] list = new int[10];
		for ( int i = 0; i < 10; i++ ) list[i] = -1;
		int num = 0, A;
		for ( int i = 0; i < 10; i++ ) {
			A = scan.nextInt();
			int left = A % 42;
			for ( int j = 0; j < i+1; j++) {
				if(left == list[j]) {
					num--;
					break;
				}
			}
			num++;
			list[i] = left;
		}
		scan.close();
		System.out.print( num );
		}
	}
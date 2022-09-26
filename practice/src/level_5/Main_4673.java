package level_5;

public class Main_4673 {
	
	public static void main(String[] args) {
		int[] num = new int[10000];
		boolean T = true;
		for ( int i = 0; i < 9999; i++ ) {
			T = true;
			for ( int j = 1; j < i; j++ ) {
				if ( cycle(j) == i ) {
					T = false;
					break;
				}
			}
			if ( T == true ) num[i] = i;
			else num[i] = 0;
		}
		for ( int out : num ) if ( out != 0 ) System.out.println( out );
	}
	
	public static int cycle( int n ) {
		String Ns;
		Ns = Integer.toString( n );
		for (int i = 0; i < Ns.length(); i++) {
			n += ( Ns.charAt(i) - '0' );
		}
		return n;
	}
}
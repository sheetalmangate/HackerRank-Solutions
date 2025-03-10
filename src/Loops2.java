import java.util.Scanner;

public class Loops2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		if( t >= 0 && t <= 500 ) {
			for(int i = 0; i<t; i++ ) {
				
				int a = in.nextInt();
				int b = in.nextInt();
				int n = in.nextInt();
				int value = a+1*b;
				
				for( int j = 1; j<= n; j++ ) {
					System.out.print( value+" ");
					value += ( Math.pow(2,j)*b);
					
				}
				System.out.println();
			}
			
			in.close();
		}
	}
}
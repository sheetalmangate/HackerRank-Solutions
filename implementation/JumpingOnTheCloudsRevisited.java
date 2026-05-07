/**
* HackerRank Problem : Jumping On the Clouds Revisited
*
*/
package implementation;

import java.util.Scanner;
import java.io.IOException;


public class JumpingOnTheCloudsRevisited{

	private static final Scanner scanner = new Scanner(System.in);

	static int jumpingOnClouds(int[] c, int k) {
	
		int e = (c[0] == 1 ) ? 97 : 99;
		int n = c.length;
		int i = (0+k)%n;

		

		while( i != 0 ) {

			if(c[i] == 1){
				e -= 3;
			} else {
				e -= 1;
			}

			i = (i+k)%n;
		}
		
		return e;

    }

	public static void main(String[] args ) throws IOException {

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);

		int[] c = new int[n];
		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c, k);
		IO.println(result);
		scanner.close();


	}

}
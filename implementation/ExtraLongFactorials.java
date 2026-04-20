/*
* HackerRank Problem - Find Digits
* 
* Count the number of digits d in the number n for which n % d == 0
*
*
*/

package implementation;
/*
* HackerRank Problem - Extra Long Factorial
* 
* Fin the factorial of given number 
* factorial = n* (n-1) * (n -2) * ...... * 3 * 2 * 1;
* factorial of n > 20 can't be stored in a 64 bit long variable. BigInteger must be used for calculation
*
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class ExtraLongFactorials {
	
	public static void extraLongFactorials(int n) {
		
		BigInteger factorial = BigInteger.ONE;
		
		for(int i = 2; i<= n; i++ ) {
			
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(factorial);
		

	}
	
	public static void main(String[] args ) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

		extraLongFactorials(n);
		
		
		
		bufferedReader.close();
		

	}
}
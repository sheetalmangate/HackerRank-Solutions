/*
* HackerRank Problem - Find Digits
* 
* Count the number of digits d in the number n for which n % d == 0
*
*
*/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.stream.IntStream;


public class FindDigits {
	
	public static int findDigits(int n) {
		
		int digit;
		int count = 0;
		int number = n;
		
		while(number > 0 ) {
			
			digit = number%10;
			
			
			if(digit != 0 ) {
			
				if( n%digit == 0 ) count++;
			}
			
			number = number/ 10;
		}
		
		return count;
	}
	
	public static void main() throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bufferedReader.readLine().trim());
		
		IntStream.range(0, t).forEach(tItr -> {
			
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());
				int result = findDigits(n);
				
				IO.println(result);
			} catch(IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		
		bufferedReader.close();
		
	}
}
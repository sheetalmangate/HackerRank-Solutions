/**
* HackerRank Problem :  Strange Counter
*
*/
package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StrangeCounter{
	
	public static long strangeCounter(long t) {
		
		long value = 3;
		long start = 1, end = 3;
		
		while( t > end ) {

			value *= 2;
			start = end+1;
			end = start + value - 1;
		}
		
		return value - Math.abs(start - t);
    }
	
	public static void main(String[] args ) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		long t = Long.parseLong(bufferedReader.readLine().trim());

        long result = strangeCounter(t);
			
		bufferedReader.close();
		
	}
	
	
}
/**
* HackerRank Problem : Sherlock and Squares
* 
* Determine the number of square integers with in given range
* 
* Note : Square integer is an integer which is the square of an integer
* 
* Input : a = 24 b = 49
* Output : 3 there are three Square integer in the given range e.g 25, 36, 49. these numbers are square of 5,6,7
*
* 
*/
package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.stream.IntStream;


public class SherlockAndSquares {
	
	public static int squares(int a, int b) {

		int l = (int)Math.ceil(Math.sqrt(a));
		int u = (int)Math.floor(Math.sqrt(b));
	
		return (u-l)+1;
    }
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(bufferedReader.readLine().trim());
		
		IntStream.range(0,q).forEach( qItr -> {
			
			try {
				
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
				
				int a = Integer.parseInt(firstMultipleInput[0]);
				int b = Integer.parseInt(firstMultipleInput[1]);
				

				int result = squares(a, b);
				
			} catch(IOException ex) {
				throw new RuntimeException(ex);
			}
			
		});
		
	}
}
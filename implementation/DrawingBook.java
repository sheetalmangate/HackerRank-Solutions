/*
* Hacker Rank Problem :: Drawing Book
*
* Teacher asks the class to open the book to page number. book can be open from front or back. they always turn a pages one at a time
* page 1 is always on right side. find out the minimum number of pages to turn
*
* Input : n is number of input and p is the page number to turn.
* n = 5 p = 3
* 
* Output : 1
*
* Approch
* 
* Function pageCount uses two different loops for counting from front and back so the time complexity is O(n)
* 
* Function pageCountOptimize uses approch to first calculates number of flips from front as it starts from 1. 
* Back flips are calculated based on total number of flips - front flips.  
* Time Complexity is :: O(1)
* 
*/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class DrawingBook {

	public static in pageCountOptimize(int n, int p) {
		
		int frontFlips = p/2;
		
		// Flips from back are counted as Total Flips - Front Flips
		int backFlips = (n/2) - frontFlips;
		
		return Math.min(frontFlips, backFlips);
		
	}
	public static int pageCount(int n, int p) {
    // Write your code here

		int current = 1;
		int pageCountStart = 0;
		int pageCountBack = 0;
		
		while(current <= n ) {
			if(current == p ) break;
			
			// need to fleep page if current page is odd when starting from page no. 1
			if(current%2 == 1 ) pageCountStart++;
			current++;
		}
		
		current = n;
		while(current >= 1 ) {
			if(current == p ) break;
			
			// need to fleep page if current page is odd when starting from page no. 1
			if(current%2 == 0 ) pageCountBack++;
			current--;
		}
		
		return Math.min(pageCountStart, pageCountBack);
    }


	public static void main(String[] args ) throws IOException {
		
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		int p = Integer.parseInt(bufferedReader.readLine().trim());
		
		int result = pageCount(n, p);
		IO.println(result);
		
		bufferedReader.close();
		
	}
		
}
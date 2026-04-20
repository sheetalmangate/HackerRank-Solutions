/*
* HackerRank Problem : Save The Prisoner
* 
* Problem Defination : A jail has a n number of prisoners and number of treats to pass out to them. a chairs are arranged around the table in
* sequential order. A start chair number will be drawn from hat. Find out which chair will receive the last sweet. 
*
* Input : 5 2 1  
		  n = number of prisoners
*		  m = number of sweets
*		  s = Start chair number
* Output : 2
*
* Srategy used : Instead of looping for a number of prisoners i.e n, I have calculated remaining number of sweets using mod operator.
* and assuming first chair is starting with 1 and last chair is n. then calulated chairs on left and chairs on right.
* 
**/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.stream.IntStream;


public class SaveThePrisoner {
	
	public static int saveThePrisoner(int n, int m, int s) {
	
		
		int rem = (m%n);
		int onRight = (n - s);
		int onLeft =  (s - 1);
		int lastChair = 0;
		
		
		if( rem == 0 ) {
			
			lastChair = (s == 1)? n : s-1;
			
		} else {
			
			if(rem <= onRight+1)
				lastChair = (s+rem)-1;
			else 
				lastChair = (rem - onRight -1);
			
		}
		
		return lastChair;
	}
	
	public static int saveThePrisoner1(int n, int m, int s) {
		
		/* We can solve this problem using moduler mathematics (s+m-1)%n. % outputs in range [0,n-1], so convert
		* all the quantities in the operand with respect to counting from 0 i.e((s-1)+(m-1))%n  
		* Then convert that answer with respect to counting from 1 i.e ((s-1)+(m-1))%n +1;
		*/
		return ((s-1)+(m-1))%n -1;
	}
	
	public static void main(String[] args ) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			
			try {
				
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
				
				int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int s = Integer.parseInt(firstMultipleInput[2]);
				
				int result = saveThePrisoner(n, m, s);
				
				IO.println(result);


			} catch(IOException ex ) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		
	}
}
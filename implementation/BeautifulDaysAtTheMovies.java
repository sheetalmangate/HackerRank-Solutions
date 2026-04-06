/*
* HackerRank Problem : Beautiful Days At The Movies
*
* Counts the number of “beautiful days” between two given days where the 
* absolute difference between a day and its reversed value is evenly divisible by a given integer.
*
*
*/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BeautifulDaysAtTheMovies {
	
	public static int beautifulDays(int i, int j, int k) {
		
		int beautifulDays = 0;
		
		while(i <= j ) {
			
			int diff = Math.abs(i - reverse(i));
			
			if(diff % k == 0 || diff == 0 ) {
				beautifulDays ++;
			}
			
			i++;
		}
		
		return beautifulDays;
    }
	
	public static int reverse(int n) {
		
		int m = 0;
		
		while(n > 0 ){
			m = n%10 + (m*10);
			n = n/10;
		}
		
		return m;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);
		
		int result = beautifulDays(i, j, k);
		
		IO.println(result);
		
		bufferedReader.close();
		 
	}
}
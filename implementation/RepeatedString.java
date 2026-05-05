/**
* HackerRank Problem : Repeated String
* 
* Find the number of letter a's in first n letters of the infinite string. given the string of lower case letters that is 
* repeated infinitely many times 
* 
* Input : abcac n = 10
* Output : 4. The substring we consider is abcacabcac, the first 10 characters of the infinte string. there are 4 occurances of the 
* string 'a' in the substring
* 
*/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class RepeatedString {
	
	public static long repeatedString(String s, long n) {
		// Write your code here
		int total = 0, partial = 0;

		long k = n/s.length();
		long m = n%s.length();

		for(int i =0; i<s.length(); i++ ) {
			
			if(s.charAt(i) == 'a') {

				total++;
				if(i < m ) partial++;
			}
		}

		return total*k + partial;

    }

	public static void main(String[] args) throws IOException{

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bufferedReader.readLine();

		long n = Long.parseLong(bufferedReader.readLine());

		long result = repeatedString(s, n);

		IO.println(result);

		bufferedReader.close();
	}	

}
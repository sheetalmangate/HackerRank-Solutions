/*
* HackerRank Problem - Append And Delete
* 
*
*
*/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AppendAndDelete {
	
	public static String appendAndDelete(String s, String t, int k) {
		
		int prefixLen = 0;
		int minLen = Math.min(s.length(), t.length());
		int minMoves = 0, pendingMoves = 0;
		
		for(int i = 0; i<minLen; i++ ) {
			if(s.charAt(i) == t.charAt(i)) {
				prefixLen ++;
			} else {
				break;
			}
		}
		
		minMoves = (s.length() - prefixLen) + (t.length() - prefixLen);
		pendingMoves = k - minMoves;
		
		if (minMoves > k ) return "No";

		if( pendingMoves%2 == 0 ) return "Yes";
		
		//delete entire string. moves on empty string results in empty string
		if( k > s.length() + t.length()) return "Yes";

		return "No";
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
		String s = bufferedReader.readLine().trim();
		String t = bufferedReader.readLine().trim();
		int k = Integer.parseInt(bufferedReader.readLine().trim());
		
		String result = appendAndDelete(s, t, k);
		IO.println(result);
		
	}
}

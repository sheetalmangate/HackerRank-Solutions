/*
* Two strings, A and B , are called anagrams if they contain all the same characters in the same frequencies. 
* the test is not case-sensitive. 
* For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
*
* i/p Hello and hlleo
* o/p Anagrams
*
*/

import java.util.Scanner;
import java.util.Arrays;

public class IsAnagram {
	
	public static void main( String[] args ){
		
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		
	}
	
	static boolean isAnagram(String a, String b) {
        
		int aVal = 0;
		int bVal = 0;
		
		if(a.length() != b.length() ) return false;
		
		if(a.length() < 1 || a.length() > 50 ) return false;
		
		if(b.length() < 1 || b.length() > 50 ) return false;
		
		if( !( a.matches("[a-zA-Z]+")) && !(b.matches("[a-zA-Z]+") ) ) return false;
		
        a = a.toLowerCase();
		b = b.toLowerCase();
		
		boolean anagram = true;
	
		for (int i = 0 ; i < a.length(); i++ ) {	
			b = b.replaceFirst(a.substring(i,i+1),"");
		}
		
		if(b.equals("")) return true;
		return false;
		
    }
}
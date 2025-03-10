/*
* Use regular expression to remove occurance of duplicate words from sentence.
* First line will take number of test cases
* Input : 5
* 	Sam went went to to to his business
* 	Reya is is the the best player in eye eye game
* 	in inthe
* 	Hello hello Ab aB
* Output : 
*	Goodbye bye world
*	Sam went to his business
*	Reya is the best player in eye game
*	in inthe
*	Hello Ab
*
*/

import java.util.Scanner;
import java.util.regex.*;
import java.util.Arrays;


public class DuplicateWords {
	
	public static void main(String[] args ) {
		
		Pattern p = Pattern.compile("\\b(\\w+)(?:\\W+\\1\\b)+");
		
		String s = "My name is Sheetal";
		String[] splitArr = s.split("\\b[ ]");
		
	
		System.out.println(Arrays.toString(splitArr));
		/*Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());
		
		while(numSentences > 0 ) {
			
			numSentences --;
		}*/
		
	}
}
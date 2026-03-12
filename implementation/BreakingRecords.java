/*
* HackerRank Problem - Breaking the Records
* 
* Given a list of game scores, this program determines how many time the player breaks 
* their highest and lowest scoring records during the season.
*
* It iterates through the scores, updating the current min and max values,
* and counts how many times each record is broken.
*
*
*/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Arrays;


public class BreakingRecords {
	
	public static List<Integer> breakingRecords(List<Integer> scores ) {
		
		int minCount = 0;
		int maxCount = 0;
		
		int min = scores.get(0);
		int max = scores.get(0);
		
		for(int i = 1; i<scores.size(); i++ ){
			
			int score = scores.get(i);
			
			if( score < min ) {
				min = score;
				minCount++;
			} else if( score > max) {
				max =score;
				maxCount++;
			}
			
		}
		
		List<Integer> result = List.of(maxCount, minCount);
		
		return result;
		
	}
	
	public static void main(String[] args ) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(bufferedReader.readLine().trim());
		
		List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" ")).
								map(Integer::parseInt).
								collect(Collectors.toList());
								
		IO.println(scores);					
	
		List<Integer> result = breakingRecords(scores);
		
		
		IO.println("result "+result);
	}


	
}
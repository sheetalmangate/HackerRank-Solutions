/*
* HackerRank Problem : Angry Professor
*
* Math professor decided to cancel the class if the students less than thresholds are present. return YES if class will cancel other wise NO.
* non poistive arrival time, 0 indicates that student arrived early and on time respectively. 
*
*
* Input : n = number of students, k = threshold number of students, int[] a = arrival time of students.
* n = 4, k = 3, a = [-1 -3 4 2 ]
* 
* Output : YES
*/
package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.List;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class AngryProfessor {
	
	public static String angryProfessor(int k, List<Integer> a) {
    
		int onTimeCount = 0;
		
			for(int num : a ) {
				
				if(num <=0 ) onTimeCount++;
				
			}
		
		return (onTimeCount >= k ) ? "NO" : "YES";
		
    }
	
	public static void main(String[] args ) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bufferedReader.readLine().trim());
		
		IntStream.range(0, t).forEach( tItr -> {
			try {
				
				String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");
				int n = Integer.parseInt(firstMultipleInput[0]);
				int k = Integer.parseInt(firstMultipleInput[1]);
				
				List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" ")).
									map(Integer::parseInt).
									collect(Collectors.toList());
				
				String result = angryProfessor(k, a);
				IO.println(result);
				
			} catch(IOException ex ) {
				
				throw new RuntimeException(ex);
			}
		});
		
		bufferedReader.close();
		
	}
	
	
}
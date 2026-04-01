/*
* HackerRank Problem - Subarray Division
* 
* Given a list of numbers on each squares of chocolate and space seperated birthday(day) and birthmonth(month), 
* the program determines how many contiguous segments of the chocolate bar sum to the given birthday 
* while having a length equal to the burth month.
*
* This problem is solved using Sliding Window Algorithm Pattern.
*
*
*/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class SubArrayDivision {
	
	public static int birthday(List<Integer> s, int d, int m) {
		
		
		int combinations = 0;
		int sum = 0;
		
		for(int i = 0; i< m; i++ ) {
			sum += s.get(i);
		}
		
		if(sum == d) combinations++;
		
		for(int i = m; i<s.size(); i++ ) {
			
			sum += s.get(i) - s.get(i - m );
			
			if(sum == d ) combinations++;
		}
		
		return combinations;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt( bufferedReader.readLine().trim() );
		
		List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" ")).
							map(Integer::parseInt).
							collect(Collectors.toList());
	
		 String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");


		int d = Integer.parseInt(firstMultipleInput[0]);
		int m = Integer.parseInt(firstMultipleInput[1]);
		
		
		int result = birthday(s, d, m);
		
		IO.println(result);
		
		bufferedReader.close();
		
	}
}
/*
* HackerRank Problem : Picking Numbers
*
*/
package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.stream.Stream;
import java.util.stream.Collectors;
/*
* HackerRank Problem : Picking Numbers
*
* Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to 1.
*
* Input : Steps : 8 and path : [UDDDUDUU]
* Output : 1
*
* Approch
*	Using frequency array. iterate through frequency array and check max number from current index and next index. as per data constrint two numbers
*   should be adjucent then only absolute difference is less than or equal to 1.  
*
*/


import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
	
	public static int pickingNumbers(List<Integer> a) {
    
		int max = 0;
		int freq[] = new int[101];
		
		for(int num : a ) {
			
			freq[num] += 1;
			
		}
		
		for(int i =0; i< 99; i++ ) {
			
			max = Math.max(max, (freq[i]+freq[i+1]) );
		}
		
		return max;
		
    }
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

		
		int result = pickingNumbers(a);
		
		IO.println(result);
		
		bufferedReader.close();
		
		
	}
}
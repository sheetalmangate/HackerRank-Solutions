/*
* HackerRank Problem - Divisible Sum Pairs
* 
* Given an array of integers and a poistive integer k. 
* This program counts the number of (i, j) pairs such that ( arr[i] + arr[j] ) is divisible by k.
* 
* Input : ar = [1,2,3,4,5,6] and k = 5
* Output : 3
* 
* Explanation : three pairs meets the criteria (1,4) (2,3) (4,6)
*
* Two approches are implemented :
* 1. Brute Force : chcks all possible pairs. Time Complexity: O(n^2)
* 2. Frequency of remainders. Time Complexity: O(n)
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
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;



public class DivisibleSumPairs {
	
	// This function uses Brute Force method to solve the problem
	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		
		int count = 0;
		
		for(int i = 0; i< ar.size()-1; i++ ) {
			for(int j = i+1; j<ar.size(); j++ ) {
				if(ar.get(i) < ar.get(j) && ( (ar.get(i)+ar.get(j))%k == 0) ) count++;
			}
		}
		
		return count;
		
	}
	
	//frequency count approach with time complexity O(n)
	
	public static int divisibleSumPairsFreq(int n, int k, List<Integer> ar) {
		
		//create map to store the frequency
		Map<Integer, Integer> map = new HashMap<>();
		
		int count = 0;
		
		for(int num : ar ) {
			
			int r = ( num % k );
			
			int reqNum = (k - r == k ) ? 0 : (k-r);
			
			if(map.containsKey(reqNum)) {
				count += map.get(reqNum);
			}
			
			map.put(r, map.getOrDefault(r, 0)+1);
					
			
		}
		
		return count;
			
	}
	
	public static void main(String[] args ) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$","").split(" ");
		
		int n = Integer.parseInt(firstMultipleInput[0]);
		int k = Integer.parseInt(firstMultipleInput[1]);
		
		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" ")).
							map(Integer::parseInt).
							collect(Collectors.toList());
							
		int result = divisibleSumPairs(n, k, ar);
		
		
		
		int result = divisibleSumPairsFreq(n, k, ar);
		
		
		bufferedReader.close();
		
	}
	
}
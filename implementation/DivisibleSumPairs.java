/*
* HackerRank Problem - Divisible Sum Pairs
* 
* Given an array of integers and a poistive integer k. 
* This program counts the number of (i, j) pairs such that ( arr[i] + arr[j] ) is divisible by k.
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


public class DivisibleSumPairs {
	
	// This function uses Brut Force method to solve the problem
	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		
		int count = 0;
		
		for(int i = 0; i< ar.size()-1; i++ ) {
			for(int j = i+1; j<ar.size(); j++ ) {
				if(ar.get(i) < ar.get(j) && ( (ar.get(i)+ar.get(j))%k == 0) ) count++;
			}
		}
		
		return count;
		
	}
	
	//frequencty distribution approch
	public static int divisibleSumPairsF(int n, int k, List<Integer> ar) {
		int[] frequency = new int[k];
		
		// Coming soon
			
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
		
		bufferedReader.close();
		
	}
	
}
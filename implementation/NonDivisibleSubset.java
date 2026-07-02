/**
* HackerRank Problem :  Non-Divisible Subset
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


public class NonDivisibleSubset {
	
	public static int nonDivisibleSubset(int k, List<Integer> s) {
    // Write your code here

		int[] freq = new int[k];
		int cnt = 0;
		
		for(int i = 0; i<s.size(); i++) {	
			freq[s.get(i)%k]++;	
		}
		
		if(freq[0] != 0) cnt++;
		
		//if k is even then take only single pair 
		if( k%2 == 0 && freq[k/2]!= 0 ) {
			cnt++;
			freq[k/2] = 0;
		}
		
		for(int i = 1; i<freq.length; i++) {
		
			if(freq[i] != 0 ) {
				
				// check for combination i and k-i. if i + k-i is equal to k then we can't consider that pair 
				if(freq[i] >= freq[k-i] ) {
					
					cnt+= freq[i];
					freq[k-i] = 0;
				} else if(freq[k-i] > freq[i]) {
					
					cnt+= freq[k-i];
					freq[k-i] = 0;
				}
			}
		}
		
		return cnt;
    }
	
	public static void main(String[] args ) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new  InputStreamReader(System.in));
		
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$","").split(" ");
		
		int n = Integer.parseInt(firstMultipleInput[0]);
		
		int k = Integer.parseInt(firstMultipleInput[1]);
		
		List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
						.map(Integer::parseInt)
						.collect(Collectors.toList());
						
		int result = nonDivisibleSubset(k, s);
		IO.println(result);
		
	}
}

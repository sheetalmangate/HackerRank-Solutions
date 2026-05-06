/**
* HackerRank Problem : Equalize the Array
*
* Given an array of integers, determine the minimum number of elements to delete to leave only elements of equal value.
*
* Input : n = 5, arr = [3, 3, 2, 1, 3]
* Output : 2
*
*/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.stream.Stream;
import java.util.stream.Collectors;

import java.util.List;


public class EqualizeTheArray {
	
	public static int equalizeArray(List<Integer> arr) {
    
		int max = 0;
		int[] frq = new int[101];

		for(int num : arr) {
			
			frq[num] += 1;
		
			max = Math.max(max, frq[num] );

		}
		
		return arr.size() - max;

    }

	public static void main(String[] args ) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = equalizeArray(arr);

		bufferedReader.close();
	}
}
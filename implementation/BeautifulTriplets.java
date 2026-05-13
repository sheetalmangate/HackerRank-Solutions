/**
* HackerRank Problem : Beautiful Triplets
*
* Given a sequance of integers a and the value of d, count the number of beautiful triplet in the sequance 
* The sequance is beautiful if a triplet ( a[i, a[j], a[k])
* 1. i < j <k
* 2. a[j] - a[i] = a[k] - a[j] = d
*
* Input : a[2, 2, 3, 4, 5] d = 1
* Output : 3
*
* There are threee beautiful tripletes by index 
* [i,j,k] = [0,2,3] [1,2,3], [2,3,4]
*
*
*/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.stream.Stream;
import java.util.stream.Collectors;

import java.util.List;
import java.util.HashSet;


public class BeautifulTriplets {
	
	public static int beautifulTriplets(int d, List<Integer> arr) {
    
		HashSet<Integer> set = arr.stream()
								.collect(Collectors.toCollection(HashSet::new));
								
		int j = 0, k = 0, count = 0;
		
		for(int i =0; i<arr.size(); i++ ) {
			
			j = d + arr.get(i);
			k = d + j;
			
			if(set.contains(j) && set.contains(k)) count++;
			
		}
		
		return count;
		

    }
	
	public static void main(String[] args ) throws IOException {
	
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);
		
		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = beautifulTriplets(d, arr);
		
		IO.println(result);
		
		bufferedReader.close();
	}
}
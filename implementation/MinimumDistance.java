/**
* HackerRank Problem : Minimum Distance
*
*/
package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.stream.Stream;
import java.util.stream.Collectors;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MinimumDistance {
	
	public static int minimumDistances(List<Integer> a) {
    // Write your code here
		
		int minDistance = Integer.MAX_VALUE;
		int temp = 0, value = 0;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i< a.size(); i++ ) {
			
			value = a.get(i);
			if(map.containsKey(value)) {
				
				temp = i - map.get(value);
				minDistance = Math.min(minDistance, temp);
				
			}
			
			map.put(value, i);
		}
		
		return (minDistance == Integer.MAX_VALUE ) ? -1 : minDistance;
    }
	
	
	public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
			
		int result = minimumDistances(a);
		
		IO.println(result);
		
		bufferedReader.close();

	}
}
/*
* HackerRank Problem - Migratory Birds
*
* Given an integer of array length and array of birds sightings by birds type id. 
* Find out the most sighting birds  with lowest type id
*
*
**/
package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.TreeMap;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


import java.util.Collections;

public class MigratoryBirds {
	
	public static int migratoryBirds(List<Integer> arr) {
		
		Map<Integer, Integer> map = new TreeMap<>();
		
		List<Integer> list = new ArrayList<>();
		
		// arrange category wise count
		for(int category : arr ) {
			map.put(category, map.getOrDefault(category, 0 )+1 );
			
		}
		
		//find max count and store their category
		int max = Collections.max(map.values());

		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() == max ) {
				list.add(entry.getKey());
			}
		}
		
		return list.get(0);
		
	}
	
	
	public static int migratoryBirdsImproved(List<Integer> arr) {
		
		int[] birdCount = new int[6];
		int max = 0;
		int birdId = 0;
		
		
		for(int val : arr ) {
			birdCount[val] += 1;
			max = Math.max(max, birdCount[val]);
		}
		
		for(int i = 1; i < birdCount.length; i++  ) {
			if(birdCount[i] == max ) {
				birdId = i;
				break;
			}
		}
		
		return birdId;
		
	}
	
	
	public static void main(String[] args)throws IOException {
		
		/*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" ")).
							map(Integer::parseInt).
							collect(Collectors.toList());*/
							
		List<Integer> arr = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
		
		int result = migratoryBirdsImproved(arr);
		IO.println(result);
		
		//bufferedReader.close();
	
	}
}
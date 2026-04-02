/*
* HackerRank Problem - Sales By Match
* 
* Find out the how many pairs of matching color socks are present in given array of integers.  
* On fisrt line of input it is accepting total number of socks in pile and 
* Second line of input is accepting the color of each socks.
*  
* Input : n = 7, ar = [1, 2, 1, 2, 1, 3, 2]
* Output : 2 number of pairs
*
* Implementation Details 
* There are two function 1) sockMerchant and 2) sockMerchantUsingHashSet
* 
* 1) sockMerchant function is solving the problem using HashMap. which stores the count of socks for each color as a key and the value as number of 
* 	socks count. after constructing the HashMap I am iterating this map using Map.Entry which calculates the number of pairs using division by 2.
* 	Time Complexity : 
*	First for loop is for iterating number of elements from List O(n) 
*	Each put/getOrDefault in HashMap is O(1)
* 	Second loop is for Map.Entry which runs for K = unique elements from Map  is O(k)
*	Final time complexity is O(n + k) i.e O(n) because k <= n
*
* 2)sockMerchantOptimized is solving problem using HashSet. it check if color is present in HashSet if not then its is inserting entry for it. 
* if color is present is HashSet it is then removing from HashSet. 
* Time Complexity :  First for loop is for iterating number of elements from List is O(n)  
* time complexity for set and remove function is O(1)
* Time Complexity = O(n +1) i.e O(n)
*/
package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import java.util.stream.Stream;
import java.util.stream.Collectors;


public class SalesByMatch {
	
	public static int sockMerchantOptimized(int n, List<Integer> ar) {
		
		int pairs = 0;
		Set<Integer> set = new HashSet<>();
		
		for(int color : ar ) {
			if(set.contains(color)) {
				set.remove(color);
				pairs++;
			} else {
				set.add(color);
			}
		}
		
		return pairs;
	}
	
	public static int sockMerchant(int n, List<Integer> ar ) {
		
		int pairs = 0;
		Map<Integer, Integer> map = new HashMap();
		
		for(int color : ar ) {
			map.put(color, map.getOrDefault(color, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet() ) {
			pairs += (entry.getValue()/2);
		}
		
		return pairs;
	}
	
	public static void main(String[] args ) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		
		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
						  .map(Integer::parseInt)
						  .collect(Collectors.toList());
						  
		int result = sockMerchantOptimized(n, ar);
		IO.println(result);
		
		bufferedReader.close();
	}
}
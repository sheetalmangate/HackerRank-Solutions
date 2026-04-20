/*
* HackerRank Problem : Circular Array Rotation
* 
* Problem Defination : 
* 
**/
package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class CircularArrayRotation {
	
	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		
		List<Integer> b = new ArrayList<>();
		// use the formula (current index - no of Iteration) if number is -ve then substract from n
		
		int temp = 0;
		int value = 0;
		int n = a.size();
		
		//modify number of rotation because if array of size n rotates n times it will return to its original state.
		k %= n;
		IO.println("Modified k : "+k);
		for(int index : queries ) {
			
			temp = ( index - k + n ) % n;  
			value = a.get(temp);
			b.add(a.get(temp));
			
		}
		
		return b;
    }
	
	
	public static void main(String[] args) throws IOException {
		
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		
		int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        int q = Integer.parseInt(firstMultipleInput[2]);
		
		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
			
		List<Integer> queries = IntStream.range(0, q).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
		.map(String::trim)
		.map(Integer::parseInt)
		.collect(Collectors.toList());

        List<Integer> result = circularArrayRotation(a, k, queries);
		
		IO.println(result);
		
		bufferedReader.close();
	}
}
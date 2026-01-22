package warmup;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/*
*	Find the minimum and maximum sum by adding exactly 4 elements
*	[1,3,5,7,9]
*	minSum = exclude the max number (i.e 9) 1+3+5+7 = 16
*	maxSum = exclude the min number (i.e 1) 3+5+7+9 = 24
*
*/

public class MinMaxSum {
	
	public static void minMaxSum(List<Integer> arr) {
		
		int maxNum = arr.get(0);
		int minNum = arr.get(0);
		long maxSum = 0L;
		long minSum = 0L;
		
		for(Integer num : arr ) {
			
			if(num > maxNum ) maxNum = num;
			if(num < minNum ) minNum = num;
			
			maxSum = (long)maxSum+num;
			minSum = (long)minSum+num;
			
		}
		
		IO.print((maxSum-maxNum)+" "+(minSum-minNum));
		
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" ")).
		map(Integer::parseInt).
		collect(toList());
		
		MinMaxSum.minMaxSum(arr);
		
		bufferedReader.close();
		
		
	}
}
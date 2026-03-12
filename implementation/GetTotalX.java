package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.io.IOException;

public class GetTotalX {
	
	public static int getTotalX(List<Integer> a, List<Integer> b) {
			
		int[] arr = a.stream().mapToInt(i->i).toArray();
		int[] brr = b.stream().mapToInt(i->i).toArray();
		
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		int min = arr[0];
		int max = brr[brr.length-1];
		
		List<Integer> multipliers = new ArrayList<>();
		
		//find multipliers of first array elements
		for(int x = min; x<= max; x++ ) {
			boolean isMultiplier = true;
			
			for(int i = 0; i< arr.length; i++ ) {
				if((x%arr[i]) != 0) {
					isMultiplier = false;
					break;
				}
			}
			
			if(isMultiplier) {
				multipliers.add(x);
			}
		}
		
		List<Integer> common = new ArrayList<>();
		for(int x : multipliers) {
			
			boolean isFactor = true;
			
			for(int i =0; i<brr.length; i++) {
				if(brr[i]%x != 0 ){
					isFactor = false;
					break;
				}
			}
			
			if(isFactor) common.add(x);
		}
		
		return common.size();
	}
	
	public static void main(String[] args ) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$"," ").split(" ");
		int n = Integer.parseInt(firstMultipleInput[0]);
		int m = Integer.parseInt(firstMultipleInput[1]);
		
		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
							.map(Integer::parseInt)
							.collect(Collectors.toList());
							
		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
							.map(Integer::parseInt)
							.collect(Collectors.toList());
							
		int total = getTotalX(arr, brr);
		IO.println(total);
 		
	}
}
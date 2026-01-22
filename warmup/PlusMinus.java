package warmup;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class PlusMinus {
	
	
	public static void plusMinus(List<Integer> arr){
		
		int n = arr.size();
		int positive = 0;
		int negative = 0;
		int zero = 0;
		
		for(Integer num : arr ) {
			
			if( num > 0 ) {
				 // positive number
				 positive++;
			} else if(num < 0) {
				// negative number
				negative++;
			} else {
				// number is 0
				zero++;
			}
			
		}
		
		
		double tempPositive = (double)positive/n;
		double tempNegative = (double)negative/n;
		double tempZero = (double)zero/n;
		
		
		System.out.printf("%.6f%n", tempPositive );
		System.out.printf("%.6f%n", tempNegative);
		System.out.printf("%.6f%n", tempZero);
		
	}
	
	void main() throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		
		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$"," ").split(" "))
		.map(Integer::parseInt)
		.collect(toList());
		
		
		plusMinus(arr);
		
	}
}
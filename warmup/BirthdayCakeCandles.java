package warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


/*
* This program is to count how many candles are tall. input is for one candle for each year of their total age
* Input : [5, 6, 8, 8, 3]
* Output : 2 
* Talleset candle among all candles is 8 and count is 2 
**/

public class BirthdayCakeCandles {
	
	public static int birthdayCakeCandles(List<Integer> candles) {
		
		int maxYear = Integer.MIN_VALUE;
		int candleCount = 0;
		
		// find the max year
		for(Integer year : candles ) {
			
			if(year > maxYear ) {
				maxYear = year;
				candleCount = 1;
			} else if(year == maxYear ) {
				candleCount ++;
			}
		}
		
		return candleCount;
		
	}
	
	
	public static void main(String[] args )  throws IOException{
		
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int candleCount = Integer.parseInt(bufferedReader.readLine().trim());
		
		List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" ")).
								map(Integer::parseInt).
								collect(toList());
		
		
		// int result = birthdayCakeCandles(candles);
		int result = birthdayCakeCandlesNew(candles);
		
		IO.print("Number of candles that are tallest "+result);
	}
}
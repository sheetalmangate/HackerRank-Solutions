/*
* HackerRank Problem : Hurdle Race
*
*/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.stream.Stream;
import java.util.stream.Collectors;

import java.util.List;

public class HurdleRace {
	
	
	public static int hurdleRace(int k, List<Integer> height) {
    
		int max = 0;
		for( int a : height ) {
			
			max = Math.max(a, max);
		}
		
		return (k >= max ) ? 0 : max-k;
    }
	
	
	public static void main(String[] args ) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> height = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = hurdleRace(k, height);
		
		IO.println(result);
		
		bufferedReader.close();


	}
}
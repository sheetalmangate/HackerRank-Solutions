/**
* HackerRank Problem :  Taum B'day
*
*/
package implementation;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class TaumBday {
	
	public static long taumBday(int b, int w, int bc, int wc, int z) {
		

		
		long blackCost = Math.min(bc, wc+z);
		long whiteCost = Math.min(wc, bc+z);
		
		return b*blackCost + w*whiteCost;
    }


	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bufferedReader.readLine().trim());
		
		IntStream.range(0,t).forEach(tItr-> {
			try {
				
				String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int b = Integer.parseInt(firstMultipleInput[0]);

                int w = Integer.parseInt(firstMultipleInput[1]);

                String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int bc = Integer.parseInt(secondMultipleInput[0]);

                int wc = Integer.parseInt(secondMultipleInput[1]);

                int z = Integer.parseInt(secondMultipleInput[2]);

                long result = taumBday(b, w, bc, wc, z);
				
				IO.println(result);
				
			} catch(IOException ex) {
				throw new RuntimeException(ex);
			}
		});
	}
}
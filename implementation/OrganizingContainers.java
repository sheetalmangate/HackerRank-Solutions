/**
* HackerRank Problem :  Organizing Containers of Balls
*
* Calculate the frequncy of balls by colors and container. sort both the array and match the frequency. 
*
*/
package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;


public class OrganizingContainers {
	
	public static String organizingContainers(List<List<Integer>> container ) {
		
		int n = container.size();
		long[] color = new long[n];
		long[] containerTotal = new long[n];
		
		for(int i = 0; i<n; i++ ) {
			
			long total = 0;
			for(int j = 0; j<n; j++ ) {
				//color
				color[j] += container.get(i).get(j);
				total += container.get(i).get(j);
			}
			containerTotal[i] = total;		
		}
		
		Arrays.sort(color);
		Arrays.sort(containerTotal);
		
		for(int i = 0; i< color.length; i++ ) {
			
			if(color[i] != containerTotal[i]) {
				return "Impossible";
			}
		}
		return "Possible";
	}
	
	public static void main(String[] args ) throws IOException {
		
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in) );
		
		int q = Integer.parseInt(bufferedReader.readLine().trim());
		
		IntStream.range(0, q).forEach( qItr -> {
		
			try{
				
				int n = Integer.parseInt(bufferedReader.readLine().trim());
				
				List<List<Integer>> container = new ArrayList<>();
				
				IntStream.range(0, n).forEach( i -> {
				
					try{
						
						container.add(
							Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
							.map(Integer::parseInt)
							.collect(Collectors.toList())
						);
						
						
					} catch( IOException ex ) {
						throw new RuntimeException(ex);
					}
				});
				
				String result = organizingContainers(container);
				
				
			} catch(IOException ex) {
				
				throw new RuntimeException(ex);
			}
		});
		
		
		bufferedReader.close();
	}
	
}
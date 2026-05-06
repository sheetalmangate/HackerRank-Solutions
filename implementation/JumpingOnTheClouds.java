/**
* HackerRank Problem : Jumping On the Clouds
* 
*
*
*
*/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class JumpingOnTheClouds {

	public static int jumpingOnClouds(List<Integer> c) {
		
		int jump = 0, i = 0;
		int n = c.size();

		while( i < n-1 ) {

			if(i+2 < n && c.get(i+2) == 0) {
				i+=2;
			} else {
				i+=1;
			}
			jump++;
		}
		
		return jump;
    }

	public static void main(String[] args ) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt( bufferedReader.readLine() );

		List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" ")).
							map(Integer::parseInt).
							collect(Collectors.toList());
						
		int result = jumpingOnClouds(c);
		
		IO.println(result);
		bufferedReader.close();


	}

}
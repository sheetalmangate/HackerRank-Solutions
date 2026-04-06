/*
* HackerRank Problem - Utopian Tree
* Utopian Tree goes through 2 cycles of growth every year. in spring it doubles its height and each summer its height increase by 1 meter.
* tree sapling is planted at spring with height of 1 meter. how tall will be the tree after n growth of cycles.
*
**/


package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

import java.util.List;


public class Utopian {
	
	public static int utopianTree(int n) {
  		
		int height = 1;
		
		for(int i =1; i<=n; i++ ) {
			
			if(i%2 == 0 ) {
				height += 1;
			} else {
				height *= 2;
			}
		}

		return height;
    }
	
	
	public static void main(String[] Rgs) throws IOException {
		
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(bufferedReader.readLine().trim());
		
		IntStream.range(0,t).forEach(tItr -> {
			
			try {
				
				int n = Integer.parseInt(bufferedReader.readLine().trim());
				int result = utopianTree(n);
				IO.println(result);
				
			} catch(IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		
		bufferedReader.close();
	}
	
}

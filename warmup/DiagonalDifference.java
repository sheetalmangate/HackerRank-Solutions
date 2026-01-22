package warmup;


import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;



public class DiagonalDifference {
	
	/* 
	* Input :: square matrix, 
	* Output :: calculate the absolute difference between the sums of its diagonals.
	*/
	
	public static int diagonalDifference(List<List<Integer>> arr) {
		
		// Write your code here
		int row = arr.size();
		int col = arr.get(0).size();
		
		int diagonalLeft = 0;
		int diagonalRight = 0;
		int i = 0;
		int j = 0;
		int k = col-1;
		
		while( i < row ) {
			
			diagonalLeft += arr.get(i).get(j);
			diagonalRight += arr.get(i).get(k);
			i++;
			j++;
			k--;
		}
		
		return Math.abs(diagonalLeft - diagonalRight);
    }

	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		
		List<List<Integer>> arr = new ArrayList<>(); 
		
		IntStream.range(0, n ).forEach( i ->  {
			try {
				arr.add(
					Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
					.map(Integer::parseInt)
					.collect(toList())
				);
			} catch(IOException e ) {
				throw new RuntimeException(e);
			}
		});
		
		int result = diagonalDifference(arr);
	}

}
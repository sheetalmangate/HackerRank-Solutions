/**
* HackerRank Problem :  Queen's Attack II. 
* calculated boundry of each edge. updated boundry if obstacle found in these 8 directions.
*
*/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.Collectors;



public class QueenAttack{
	
	public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
		
		int top = n - r_q;
		int right = n - c_q;
		int bottom = r_q -1;
		int left = c_q - 1;
		
		int row, col, temp;
		
		int topRight = Math.min(n - r_q, n - c_q);
		int bottomRight = Math.min(r_q - 1, n - c_q);
		int topLeft =  Math.min(n - r_q, c_q - 1);
		int bottomLeft = Math.min(r_q -1, c_q - 1);
		
		for(List<Integer> obstacle : obstacles ) {
			
			row = obstacle.get(0);
			col = obstacle.get(1);
			temp = 0;
			
			if( row == r_q && col > c_q) {					
				temp = ( col - c_q ) -1;
				right = Math.min(right, temp);
			} else if(row == r_q && col < c_q ) {
				temp = ( c_q - col ) -1;
				left = Math.min(left, temp);
			} else if( col == c_q && row > r_q) {
				temp = (row - r_q ) - 1;
				top = Math.min(top, temp);
			} else if(col == c_q && row < r_q ) {
				temp = (r_q - row) - 1;
				bottom = Math.min(bottom, temp);
			} else if( Math.abs(row - r_q ) == Math.abs( col - c_q ) ) {
				
				//diagonal
				if(row > r_q && col > c_q ) {
					temp = Math.min(row - r_q, col - c_q) - 1;
					topRight = Math.min(topRight, temp);
				} else if( row < r_q && col > c_q ) {
					temp = Math.min(r_q - row, col - c_q) - 1;
					bottomRight = Math.min(bottomRight, temp);
				} else if( row < r_q && col < c_q ) {
					temp = Math.min(r_q - row, c_q - col ) -1;
					bottomLeft = Math.min(bottomLeft, temp);
					
				} else if(row > r_q && col < c_q) {
					temp = Math.min(row - r_q, c_q - col) -1;
					topLeft = Math.min(topLeft, temp);
				}
			}
		}
		
		IO.println("top = "+top+" right = "+right+" bottom = "+bottom+" left = "+left +" ");
		IO.println("topRight = "+topRight+" bottomRight = "+bottomRight+" bottomLeft = "+bottomLeft+" topLeft = "+topLeft +" ");
		
		return right + left + top + bottom + topRight + bottomRight + bottomLeft + topLeft;
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		
		int n = Integer.parseInt(firstMultipleInput[0]);
		int k = Integer.parseInt(firstMultipleInput[1]);
		
		String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		int r_q = Integer.parseInt(secondMultipleInput[0]);
		int c_q = Integer.parseInt(secondMultipleInput[1]);
		
		List<List<Integer>> obstacles = new ArrayList<>();
		
		IntStream.range(0, k).forEach(i-> {
			try{
				
				obstacles.add(
					Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
							.map(Integer::parseInt)
							.collect(Collectors.toList())
				);
			} catch(IOException ex ){
				
				throw new RuntimeException();
			}
		});
		
		int result = queensAttack(n, k, r_q, c_q, obstacles);

		IO.println(result);
		
		bufferedReader.close();
		
	}



}


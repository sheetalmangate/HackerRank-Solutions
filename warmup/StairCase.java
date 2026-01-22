package warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
* Print Staitcase of Size n. assume n = 5
* 
* - - - - #	4 1
* - - - # #	3 2
* - - # # # 2 3
* - # # # # 1 4
* # # # # # 0 5
*
*/

public class StairCase {
	
	
	public static void staircase(int n) {
    
		for(int i = 1; i<= n; i++ ) {
			
			for(int space = n; space > i; space-- ) {
				System.out.print(" ");
			}
			
			for(int symbol = 1; symbol <= i; symbol++ ) {
				System.out.print("#");
			}
			
			System.out.println();
		}
		
    }
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		
		staircase(n);
		
	}
}
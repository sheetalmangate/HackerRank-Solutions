/*
* HackerRank Problem : Cat and Mouse
*
*
*
*
*
*
*
*
* HackerRank Problem :: Cat and Mouse
*
* Two cats and Mouse are at various poistions on a line. determone which cat will reach the mouse first.
* assuming the mouse does not move and cats traval at equal speed. if cats reach at same time then Mouse will allowed to move.
* if Cat A reaches first the print out "Cat A" and if Cat B reaches first the print "Cat B". if both cats reach at same time 
* print "Mouse C"
*
* Input : 
* 	n = 2 (number of queries)
* 	x = Starting point for Cat A, y = Starting point for Cat B, z = Starting point for Mouse C
* 	x = 1 y = 2 z = 3
* 	x = 1 y = 3 z = 2
* Output
*	Cat B
*	Mouse C
*
*
*/
package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CatAndMouse {
	
	
    static String catAndMouse(int x, int y, int z) {

		String str = "Mouse C";
		
		if(Math.abs(z-x) < Math.abs(z-y)) {
			str = "Cat A";
		} else if(Math.abs(z-x) > Math.abs(z-y) ) {
			str = "Cat B";
		}

		return str;
		
    }


	public static void main(String[] args ) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		
		for(int i = 0; i< n; i++ ) {
			String[] xyz = bufferedReader.readLine().split(" ");
			
			int x = Integer.parseInt(xyz[0]);
			int y = Integer.parseInt(xyz[1]);
			int z = Integer.parseInt(xyz[2]);
			
			String result = catAndMouse(x, y, z);
			
			IO.println(result);
		}
		
	}
}
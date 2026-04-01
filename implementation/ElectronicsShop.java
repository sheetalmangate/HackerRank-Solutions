/*
* HackerRank Problem :: Electronic Shop
*
*	Find out the most expensive keyboard and USB drive that can be purchased with a given budget. you have to return the maximum 
*	amount that you can spent or -1 if it is not possible to buy both the items.
*
*	Input : 
*	1) First line contains three space separated integer values 
*		a. Budget :: b
*		b. Number of keyboards :: n
*		c. number of USB Drives :: m
*	2) Second line contains n space seperated integers, price of each keyboard
*	3) Third line contains m space separated integers, price of USB drive
*
*	b = 60, keyboard[40, 50, 60] and USB drive[5, 8, 12]
*	
* 	Output : 58
*
*
*	Approch
* 
*	1) getMoneySpent :: This function uses the Brute-Force algoritham by checking each pair of keyboard and USB.
*	 Time complexity : O(n * m ) where n is the number of keyboard and m is the number of USB drive
*	 
*	2) getMoneySpentOptimized :: This function uses Two pointer mechanisam. pointer used for USB is running till it gets sum less than or equal to
*	required budget. and pointer is set for every keyboard price.
*	Time Complexity : 
*
**/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Arrays;


public class ElectronicsShop {
	
	
	// Optimized this using two pointers method. Instead of resetting j every time : moves j only when it needed.
	
	static int getMoneySpentOptimized(int[] keyboards, int[] drives, int b) {
		
		Arrays.sort(keyboards);
		Arrays.sort(drives);

		int maxSpent = -1;		
		
		for(int i = 0; i< keyboards.length; i++ ) {
			
			int j = (drives.length) -1;
			
			while(j >= 0) {
				
				int tempSum = keyboards[i] + drives[j];
				
				if( tempSum <= b ){
					
					maxSpent = Math.max(maxSpent, tempSum);
					break;
				}
				
				j--;
			}
			
		}
		
		return maxSpent;
		
	}
	
	// Bruit Force approch
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		
		int maxSpent = -1;

		for(int i = 0; i< keyboards.length; i++ ) {
			
			
			for(int j = (drives.length)-1; j>= 0; j-- ) {
				
				int tempSum = keyboards[i] + drives[j];
				
				if(tempSum <= b ) {
				
					maxSpent = Math.max(maxSpent, tempSum);
					
				}
				
			}
			
		}
		
		return maxSpent;

    }
	
	public static void main(String[] args ) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] bnm = bufferedReader.readLine().split(" ");
		int b = Integer.parseInt(bnm[0]);
		int n = Integer.parseInt(bnm[1]);
		int m = Integer.parseInt(bnm[2]);
		
		int[] keyboards =  Arrays.stream(bufferedReader.readLine().replace("\\s+$","").split(" ")).
							mapToInt(Integer::parseInt).
							toArray();
							
		int[] drives = Arrays.stream(bufferedReader.readLine().replace("\\s+$", " ").split(" ")).
						mapToInt(Integer::parseInt).
						toArray();
		
		int moneySpent = getMoneySpentOptimized(keyboards, drives, b);

		IO.println(moneySpent);
		
		bufferedReader.close();
	}
}
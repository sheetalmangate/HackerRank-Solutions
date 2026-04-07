/*
* HackerRank Problem : Viral Adevertising
* 
* Problem Defination : Every day product is adevertised to 5 people on the social media. it is liked by Math.floor(5/2) and shared to Math.floor(5/2)*2 
* people. return the number of shares for given days
*
*
**/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ViralAdvertising {
	
	public static int viralAdvertising(int n ) {
		
		int k = 1;
		int recipents = 5;
		int likes = 0;
		
		
		while( k <= n ) {
			
			likes += (int)Math.floor(recipents/2);
			recipents = (int)Math.floor(recipents/2)*3;	
			k++;
			
		}
		
		return likes;
	}
	
	public static void main(String[] args ) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		 
		int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = viralAdvertising(n);
		
		IO.println(result);
		
		bufferedReader.close();
		
	}
}
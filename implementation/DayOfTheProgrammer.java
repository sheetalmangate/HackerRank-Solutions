/*
* HackerRank Problem - Day Of The Programmer
*
* Find out the 256th day of the year as a Day of the Programmer.
' Given then year in the inclusive range from 1700 to 2700.  
* From 1700 to 1917 Russia's official calendar was the Julian calendar. since 1919 they used Gregorian calendar system.  the transition from  Julian
* to Gregorian occurd on 1918. where after 31st Jan 32rd day of that year was 14th Feb.
* Print out the full date of Day of Programmer in 
* Print out the full date of Day of Programmer in dd.mm.yyyy format
* 
* Input : 2017
* Output : 13.09.2017
*
* Time complexity of function dayOfProgrammer is constant time : O(1). Because it performs fixed number of operations regardless of the input.
*
*/
package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class DayOfTheProgrammer {
	
	public static String dayOfProgrammer(int year) {
		
		// (Jan, Mar, May, Jul, Aug = 31) ( Apr, Jun = 30) = 215 i.e 255 - 215 = 13
		int day = 13;
		
		String dateString = "";
		
		if(year == 1918 ) {
			
			// 230
			day = 26;
			
		} else if(year >= 1700 && year <= 1917 ) {
			
			if( year % 4 == 0 ) day = 12;
			
		} else if(year >= 1919 && year <= 2700 ) {
			
			if(( year % 400 == 0) || (year % 4 == 0 && year % 100 != 0 )) day = 12;
		}
			
		dateString = day+".09."+year;
		
		return dateString;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int y = Integer.parseInt(bufferedReader.readLine().trim());
		
		String result = dayOfProgrammer(y);
		
		IO.println(result);
		
	}
}
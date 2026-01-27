package warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/*
* Time Conversion (Warm-up)
* Converts a 12-hour time format with AM/PM into a 24-hour time format.
* Input : 07:05:45PM
* Output : 19:05:45
*
*/

public class TimeConversion {
	
	public static String timeConversion(String s ) {
		
		String[] parts = s.split(":");
		
		int hh = Integer.parseInt(parts[0]);
		String mm = parts[1];
		String ss = parts[2].replaceAll("AM|PM","");
		String hour = parts[0];
		
		
		if(s.contains("AM")) {
			
			if(hh == 12 ) hour = "00";

		} else if(s.contains("PM")) {
			if(hh >= 1 && hh <= 11 ) {
				hh += 12;
				hour = String.format("%02d", hh);
				
			}
		}
		
		
		return hour+":"+mm+":"+ss;
		
	}
	
	public static void main( String[] args ) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bufferedReader.readLine();
		
		String result = timeConversion(s);
		
		IO.print(result);
		
		bufferedReader.close();
		
	}
}
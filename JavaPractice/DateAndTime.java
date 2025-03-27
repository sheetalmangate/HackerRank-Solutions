import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;

public class DateAndTime {
	
	public static void main( String[] args ) {
		
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
			
			String[] inputs = bufferedReader.readLine().replaceAll("\\s+$","").split(" ");
			
			int month = Integer.parseInt(inputs[0]);
			int day = Integer.parseInt(inputs[1]);
			int year = Integer.parseInt(inputs[2]);
			
			Result.findDay(month, day, year );
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

class Result {
	
	static String findDay(int month, int day, int year ) {
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, day );
		String dayName = c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
		System.out.println(dayName);
		return dayName;
	}
	
}
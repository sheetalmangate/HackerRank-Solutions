package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CamelCase {
	
	
	public static  int camelCase(String s) {
		
		if(s.length() == 0 ) return 0;
		
		int wordCount = 1;
		var reg = "[A-Z]";
		String ch = "";
		
		
		for( int i =0; i< s.length(); i++ ) {

			ch  = String.valueOf(s.charAt(i));
			
			if(ch.matches(reg)) {
				wordCount++;
			}
		}
		
		return wordCount;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine();
		
		int result = camelCase(s);
		IO.print(result);
		
		
	}
}
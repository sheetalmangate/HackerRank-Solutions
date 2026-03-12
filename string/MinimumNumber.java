package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class MinimumNumber {
	
	public static int minimumNumber(int n, String password) {
		
		int min = 0;
		
		String regDigit = ".*[0-9].*";
		String regUpper = ".*[A-Z].*";
		String regLower = ".*[a-z].*";
		String regSpecial = ".*[!@#$%^&*()\\-+].*";
		
		// int missingLength = Math.max(0, 6 - n);
		
		
		if(!password.matches(regDigit)) min++;
		if(!password.matches(regUpper)) min++; 
		if(!password.matches(regLower)) min++; 
		if(!password.matches(regSpecial)) min++;
		
		IO.println("missing count digit "+password.matches(regDigit));
		IO.println("missing count upper "+password.matches(regUpper));
		IO.println("missing count lower "+password.matches(regLower));
		IO.println("missing count special "+password.matches(regSpecial));
		
		int targerCharLength = n + min;
		
		if(targerCharLength < 6 ) min += (6-targerCharLength);
		
		//return Math.max(min, missingLength);
		return min;
	}
	
	void main(String[] args ) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		
		var password = bufferedReader.readLine().trim();
		
		var answer = minimumNumber(n, password);
		
		IO.println("Minimum char to add "+answer);
	}
}

import java.util.Scanner;
import java.util.Arrays;

public class StringTokens {
	
	public static void main(String[] args ){
		
	
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(s.length() >= 1 && s.matches("[A-Za-z !,?._'@]+") ) {
			
			String[] tokens = s.split("[!,?._'@ ]+");
			
			System.out.println(tokens.length);
			for(int i = 0; i<tokens.length; i++ ) {
				
				System.out.println(tokens[i]);
			}
		}
		
		sc.close();

		
	}
}
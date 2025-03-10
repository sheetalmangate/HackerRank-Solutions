import java.util.Scanner;
import java.util.regex.*;

public class IsValidPattern {
	
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine()); 
		
		while( testCases > 0  ) {
		
			String pattern = in.nextLine();
			
			try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
			
			testCases--;
		}
		
		sc.close();
	}
	
}
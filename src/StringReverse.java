import java.util.Scanner;
import java.lang.StringBuilder;

public class StringReverse {
	
	public static void main(String[] args ){
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		
		StringBuilder sb  = new StringBuilder(A).reverse();
		String rev = sb.toString();
		
		if(A.equals(rev)) 
			System.out.println("Yes");
		else 
			System.out.println("No");
			
	}
}
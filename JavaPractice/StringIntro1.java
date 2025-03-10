import java.util.Scanner;

/*
* Given two strings of lowercase English letters,  and , perform the following operations:
* Sum the lengths of A and B.
* Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
* Capitalize the first letter in A and B and print them on a single line, separated by a space.
* Input : hello
*		  world
* Output : 10
*		   No
*	 	   Hello World
*
*/
public class StringIntro1 {
	
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		System.out.println(A.length()+B.length());
		if(A.compareTo(B)>0) 
			System.out.println("Yes");
		else 
			System.out.println("No");
			
		String temp = A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1);
		System.out.println(temp);
		
		
	}
}
package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;


public class ReducedString {
	
	public static String superReducedString(String s) {
		
		int i = 1;
		
		while( i < s.length() ) {
			
			String subStr = ""+s.charAt(i)+s.charAt(i-1);
			if(s.charAt(i) == s.charAt(i-1) ) {
				s = s.replaceFirst(subStr,"");
				i = 1;
				continue;
			}
			
			i++;
		}
	
			
		return s;
	}
	
	public static String superReducedStringUsingStack(String s) {
		
		
		Stack<Character> charStack = new Stack<>();
		
		for( int i =0; i< s.length(); i++ ) {
			
			char c = s.charAt(i);
			
			if(charStack.empty()) {
				charStack.push(c);
				
			} else if(charStack.peek() == c ) {
				charStack.pop();
			} else {
				charStack.push(c);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for( Character c : charStack ) {
			sb.append(c);
		}
		
		return (sb.length() == 0) ? "Empty String" : sb.toString() ;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bufferedReader.readLine();
		
		//String result = ReducedString.superReducedString(s);
		String result1 = ReducedString.superReducedStringUsingStack(s);
		
		//IO.println(result);
		IO.println(result1);
			
	}
}
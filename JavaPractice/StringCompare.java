import java.util.Scanner;

public class StringCompare {
	
	public static String getSmallestAndLargest(String s, int k) {
	
		String smallest = s.substring(0,k);
		String largest = s.substring(0,k);
		String temp = "";
		int start, end;
		
		for(int i =0; i<k; i++ ) {
			start = i;
			end = i+k;
			while( start < s.length() && end <= s.length()) {
				
				temp = s.substring(start, end);
				
				if(smallest.compareTo(temp) > 0  ) smallest = temp;
				if(largest.compareTo(temp) < 0 ) largest = temp;
				start = start +k;
				end = end + k;
			}
		}
		
		
		return smallest+" \n"+largest;
		
		
	}
	
	
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		
		sc.close();
		System.out.println(getSmallestAndLargest(s, k));
		
	}
}
package implementation;

public class Kangaroo {
	
	public static String kangaroo(int x1, int v1, int x2, int v2 ) {
		
		if(x1 < x2 && v1 <= v2) 
			return "NO";
		
		int j =  (x2 - x1) % (v1- v2);
		
		if(j == 0 ) 
			return "YES";
		else 
			return "NO";
		
	}
	
	public static void main(String[] args ) {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstMultipleInput = bufferedReader.readLine().replace("\\s+$").split(" ");
		
		int x1 = Integer.parseInt(firstMultipleInput[0]);
		int v1 = Integer.parseInt(firstMultipleInput[1]);
		int x2 = Integer.parseInt(firstMultipleInput[2]);
		int v2 = Integer.parseInt(firstMultipleInput[3]);
		
		kangaroo(x1, v1, x2, v2);
		
	}
}
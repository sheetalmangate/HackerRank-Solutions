/**
* HackerRank Problem : Halloween Sale
*
*/
package implementation;

public class HalloweenSale {
	
	public static int howManyGames(int p, int d, int m, int s) {
		
		int count = 0;
		
		while(s >= p ) {
			
			s -= p;
			
			count ++;
			
			p = Math.max(d, p-d);
			
		}
		
		return count;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int p = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        int m = Integer.parseInt(firstMultipleInput[2]);

        int s = Integer.parseInt(firstMultipleInput[3]);
		
		int answer = Result.howManyGames(p, d, m, s);

		IO.println(answer);
		
		bufferedReader.close();
		
	}
}
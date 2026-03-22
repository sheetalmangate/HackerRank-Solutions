/*
* HackerRank Problem - Bill Division
*
* Problem - Two friends Anna and Brian deciding how to split a restaurant bill at a dinner. each will only pay for items they consume.
* you need to determine if calculation is correct. 
* If Brain did not overcharge Anna print Bon Appetit. o.w print the difference that Brian must refund to Anna.
*
* Input : bill[2, 10, 2, 9] and Anna decline to eat item k = bill[1] which costs 10 and Anna contributed to the bill is 12
* Output : 5
*
* Explanation - Total cost of the shared items = 3+2+9 = 14. split into half is 7. Brian charged Anna 12. Anna was overcharged by 5.
*
**/


package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.stream.Collectors;

import java.util.List;



public class BillDivision {

	public static void bonAppetit(int k, List<Integer>bill, int b) {
		
		int actualBill = 0;
		
		for(int i = 0; i<bill.size(); i++ ) {
			if(i == k ) continue;
			
			actualBill += bill.get(i);
		
		}
		
		if(b > actualBill ) return;
		
		actualBill = actualBill/2;
		
			
		if(b == actualBill )  {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b-actualBill);
		}
		
		
	}
	
	
	public static void main(String[] Rgs) throws IOException {
		
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$","").split(" ");
		
		int n = Integer.parseInt(firstMultipleInput[0]);
		int k = Integer.parseInt(firstMultipleInput[1]);
		
		
		List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).
							 map(Integer::parseInt).
							 collect(Collectors.toList());
							 
		int b = Integer.parseInt(bufferedReader.readLine().trim());
		
		bonAppetit(k, bill, b);
		
	}

}


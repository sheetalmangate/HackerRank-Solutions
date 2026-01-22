package warmup;

import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Triplet {
	
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		int p1 = 0;
		int p2 = 0;
		List<Integer> result = new ArrayList<>();
		
		for(int i = 0; i< 3; i++) {
			if(a.get(i) > b.get(i)) p1++;
			else if(a.get(i) < b.get(i)) p2++;
			else if(a.get(i) == b.get(i)) continue;
		}
		
		result.add(0, p1);
		result.add(1, p2);
		
		return result;
    }
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
		.map(Integer::parseInt).collect(toList());
		
		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
		.map(Integer::parseInt).collect(toList());
		
		List<Integer> result = compareTriplets(a, b);
		
		IO.print(result);
		
	}
}
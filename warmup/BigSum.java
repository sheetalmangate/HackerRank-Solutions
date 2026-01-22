package warmup;

import java.util.List;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class BigSum {
	
	public static long aVeryBigArray(List<Long> ar ) {
		
		long sum = 0L;
		
		for(Long item : ar) {
			sum = sum + item;
		}
		
		
		return sum;
	}
	
	
	public static void main(String[] args ) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int arCount = Integer.parseInt(bufferedReader.readLine().trim());
		
		List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
		.map(Long::parseLong)
		.collect(toList());
		
		long result = aVeryBigArray(ar);
		
		IO.print(result);
		
		
	}
}
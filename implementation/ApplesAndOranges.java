package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;


public class ApplesAndOranges {
	
	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		
		int appleCount = apples.stream().mapToInt((m) -> m+a).filter((pos) -> pos >= s && pos <= t ).count();
		int orangeCount = oranges.stream().mapToInt((n) -> n+b).filter((pos) -> pos>= s && pos <= t).count();
	
		
		System.out.println(appleCount);
		System.out.println(orangeCount);
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$","").split(" ");
		int s = Integer.parseInt(firstMultipleInput[0]);
		int t = Integer.parseInt(firstMultipleInput[1]);
		
		String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$","").split(" ");
		int a = Integer.parseInt(secondMultipleInput[0]);
		int b = Integer.parseInt(secondMultipleInput[1]);
		
		String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$","").split(" ");
		int m = Integer.parseInt(thirdMultipleInput[0]);
		int n = Integer.parseInt(thirdMultipleInput[1]);
		
		List<Integer> apples = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" ")).
							map(Integer::parseInt).
							collect(Collectors.toList());
		
		List<Integer> oranges = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" ")).
								map(Integer::parseInt).
								collect(Collectors.toList());
		
		countApplesAndOranges(s, t, a, b, apples, oranges);
		
	}
}
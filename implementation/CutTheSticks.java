package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.stream.Stream;
import java.util.stream.Collectors;

import java.util.List;
import java.util.ArrayList;

public class CutTheSticks {

	public static List<Integer> cutTheSticks(List<Integer> arr) {
		// Write your code here

		List<Integer> result = new ArrayList<>();

        int[] freq = new int[1000];
        int n = arr.size();
        result.add(n);

        for(int num : arr ) {
            freq[num] = freq[num]+1;
        }

        for( int i = 0; i< freq.length; i++ ) {

            if(freq[i] == 0 ) continue;

            n = n - freq[i];

            if(n == 0) break;

            result.add(n);
            
        }


        return result;
    }


	public static void main(String[] args) throws IOException {
	
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		
			List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s$+", " ").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

			List<Integer> result = cutTheSticks(arr);

			IO.println(result);
			
			bufferedReader.close();

	}
}
/**
* HackerRank Problem :  ACM-ICPC Team
*
*/
package implementation;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import java.util.stream.IntStream;
import java.util.stream.Collectors;


public class ACMICPCTeam {
	
	public static List<Integer> acmTeam(List<String> topic) {
    
		int teamCount =0, maxSubject = 0;
		List<Integer> result = new ArrayList<>();
		int[] temp = new int[topic.get(0).length()+1];
		
		
		for(int i = 0; i < topic.size()-1;i++) {
			for(int j = i+1; j < topic.size(); j++ ) {
				
				
				int k =0, count = 0;
				
				do {
					
					if(topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1') {
						
						count ++;
						
					}
					
					k++;
					
				} while( k < topic.get(i).length() );
					
				temp[count] += 1;
				
				maxSubject = Math.max(maxSubject, count);	
				
			}
		}
				
		result.add(maxSubject);
		result.add(temp[maxSubject]);
		
		return result;

    }
	
	public static void main(String[] args ) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(Collectors.toList());

        List<Integer> result = acmTeam(topic);
		
		bufferedReader.close();
		
	}
	
	
	
}
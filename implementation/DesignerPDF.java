/*
* HackerRank Problem : Designer PDF
*
*/
package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.stream.Stream;
import java.util.stream.Collectors;

import java.util.List;

public class DesignerPDF {
	
	public static int designerPdfViewer(List<Integer> h, String word) {
		
		int n = word.length();
		char[] chars = word.toCharArray();
		int tallest = -1;
		
		for(char ch: chars) {
			
			int chIndex = (int) ch - 'a';

			tallest = Math.max(tallest, h.get(chIndex));
			
		}
		
		return tallest*n;
	}
	
	public static void main(String[] args ) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		 List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());
			
		String word = bufferedReader.readLine();

        int result = designerPdfViewer(h, word);
		IO.println(result);
		
		bufferedReader.close();
	}
}
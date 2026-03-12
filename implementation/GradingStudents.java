package implementation;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Collectors;


public class GradingStudents {
	
	public static List<Integer> gradingStudents(List<Integer> grades ) {
		
		List<Integer> result = new ArrayList<>();
		
		for(int grade : grades ) {
			
			
			if(grade < 38 ) {
				result.add(grade);
			} else {
				
				int nextGrade = ((grade/5) + 1)*5;
				int gradeDiff = nextGrade - grade;
				
				if(gradeDiff < 3 ) 
					result.add(nextGrade);
				else 
					result.add(grade);
			}	
		}
		
		return result;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());
		
		List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$","").trim();
			} catch(IOException e ) {
				throw new RuntimeException(e);
			}
		})
		.map(String::trim)
		.map(Integer::parseInt)
		.collect(Collectors.toList());
		
		List<Integer> result = gradingStudents(grades);
		IO.print(result);
		
	}
}
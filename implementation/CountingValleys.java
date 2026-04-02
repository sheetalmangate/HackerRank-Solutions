/*
* HackerRank Problem : Counting Valleys
*
* A hiker keeps meticulous record of their hikes. for every step if it is uphill it is U or downhill D steps. Hike always 
* starts and ends at sea level. Mountain is a consecative steps above the sea level and Valley is the sequence of steps below the sea level.
* Find out the number of vallyes traversed
*
* Input : Steps : 8 and path : [UDDDUDUU]
* Output : 1
*
* Approch
*	I have used stack for tracking each step. if current step is not equal to the top off stack then poping the element from stack.
*   Stack is always empty when hiker is at sea level. downhill is counted when hiker steps D and stack is empty. 
*   Time complexity is O(n) + O(1) = O(n)
*
*/

package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.Stack;


public class CountingValleys {
	
	public static int countingValleys(int steps, String path) {
		
		int valleyCount = 0;
		Stack<Character> stack = new Stack<>();
		
		char[] arr = path.toCharArray();
		
		for(int i = 0; i != arr.length; i++ ) {
			
			if(arr[i] == 'D'&& stack.empty() ) {
				valleyCount ++;
				stack.push('D');
			} else {
				if(!stack.empty() && arr[i] != stack.peek()) {
					stack.pop();
				} else {
					stack.push(arr[i]);
				}
			}
		}
		
		return valleyCount;
		

    }


	
	public static void main(String[] args ) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int steps = Integer.parseInt(bufferedReader.readLine().trim());
		String path = bufferedReader.readLine().trim();
		
		int result = countingValleys(steps, path);
		
		bufferedReader.close();
		
	}
}
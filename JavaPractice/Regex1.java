import java.util.Scanner;

public class Regex1 {
	
	public static void main(String[] args ) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String ip = in.next();
			System.out.println(ip.matches(new MyRegex().pattern ));
		}
		
	}
}

class MyRegex {
	
	public String pattern;
	public MyRegex() {
		this.pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
	}
}
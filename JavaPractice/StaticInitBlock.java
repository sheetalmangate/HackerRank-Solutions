import java.util.Scanner;

public class StaticInitBlock {
	static int H;
	static int B;
	static {
		Scanner sc = new Scanner(System.in);
		H = Integer.parseInt(sc.next());
		B = Integer.parseInt(sc.next());
		sc.close();
	}
	
	public static void main(String[] args ) {
		
		if( H <= 0 ||  B <= 0 ) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} else {
			System.out.println(H*B);
		}
		

	}
}
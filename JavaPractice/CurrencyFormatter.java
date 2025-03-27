import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class CurrencyFormatter {
	
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		double payment = sc.nextDouble();
		sc.close();
		
		NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
		String us = usFormat.format(payment);
		
		NumberFormat bharatFormat = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		bharatFormat.setCurrencySymbol("\u20B9");
		String bharat = bharatFormat.format(payment);
		
		NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = chinaFormat.format(payment);
		
		NumberFormat franceFormat = NumberFormat.getCurrencyInstance(new Locale("fr","FR"));
		String france = franceFormat.format(payment);
		
		System.out.println("US: " + us);
        System.out.println("India: " + bharat);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
		
	}
	
}
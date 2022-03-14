import java.util.*;
import java.text.*;

public class Java_Currency_Formatter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double payment = sc.nextDouble();

		if (payment>=0 && payment<=Math.pow(10,9)) {
			NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
			System.out.println("US: " + us.format(payment));

			// Locale INDIA = new Locale.Builder().setLanguage("en").setRegion("IN").build();
			// Locale INDIA = new Locale("en","IN");
			NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
			System.out.println("India: " + india.format(payment));

			NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
			System.out.println("China: " + china.format(payment));

			NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
			System.out.println("France: " + france.format(payment));
		} else {
			System.out.println("Value entered is not within the range.");
		}
	}
}
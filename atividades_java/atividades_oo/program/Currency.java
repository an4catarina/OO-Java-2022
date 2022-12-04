package program;
import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Currency {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What's the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.converter(dollar, amount));
		
		
		sc.close();
	}

}

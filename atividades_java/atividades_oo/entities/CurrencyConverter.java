package entities;

public class CurrencyConverter {
	
	public static double iof = 0.06;
	
	public static double converter(double dolar, double amount) {
		return dolar * amount * (1.0 * iof);
	}
}

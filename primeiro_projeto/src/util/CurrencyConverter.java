package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double dolarConvert(double buy, double dollar) {
		return buy * dollar * (1.0 + IOF);
	}
	
}

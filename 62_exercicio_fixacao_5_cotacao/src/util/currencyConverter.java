package util;

public class currencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double price, quantity;
	
	public static double converter() {
		return price * quantity * (1.0 + IOF);
	}
	
}

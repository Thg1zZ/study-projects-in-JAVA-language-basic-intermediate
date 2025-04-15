package Calculo;

public class CurrencyConverte {

	public static double valueDolar;
	public static double amountDolar;
	public static final int iof = 6;

	public static double convert() {
		valueDolar += (valueDolar * 6) / 100.0;

		return valueDolar * amountDolar;
	}

}

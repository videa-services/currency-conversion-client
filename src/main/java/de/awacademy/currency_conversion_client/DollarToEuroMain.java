package de.awacademy.currency_conversion_client;

import de.awacademy.currency_conversion_service.Currency;
import de.awacademy.currency_conversion_service.CurrencyConverter;

/**
 * Main class to convert USD to Euro. Just replace value parameter which
 * is zero by value from feature branch.
 */
public class DollarToEuroMain {

	
	/**
	 * Main method as entry point for this currency conversion.
	 */
	public static void main(String[] args) {
		
		CurrencyConverter currencyConverter = new CurrencyConverter();
		
		String valueInEuro = currencyConverter.convertToEuro(Currency.USD, "7.15");
		
		System.out.println();
		System.out.println(valueInEuro + " Euro");
		System.out.println();
	}

}

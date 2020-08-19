package de.awacademy.currency_conversion_client;

import org.junit.Test;

import de.awacademy.currency_conversion_service.Currency;
import de.awacademy.currency_conversion_service.CurrencyConverter;

public class MoneyUsdTest {

	@Test
	public void usdToEuro() {
		CurrencyConverter currencyConverter = new CurrencyConverter();
		
		String valueInEuro = currencyConverter.convertToEuro(Currency.USD, "0");
		
		System.out.println();
		System.out.println(valueInEuro + " Euro");
		System.out.println();
	}
	
}

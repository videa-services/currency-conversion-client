package de.awacademy.currency_conversion_client;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.awacademy.currency_conversion_service.AdvancedEncryptionStandard;

public class SecretKeyTest {
	
	@Test
	public void fetchValue() {
		AdvancedEncryptionStandard advancedEncryptionStandard = new AdvancedEncryptionStandard();
		String value = advancedEncryptionStandard.decrypt("my-secret-key");
		
		System.out.println();
		System.out.println(value);
		System.out.println();
		
		assertTrue(true);
	}

}

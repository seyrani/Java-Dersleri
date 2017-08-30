package com.seyranidemirel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {

	String message = "Unit Test Ekranı";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {

		// message = "Yeni Birim Testi"; // eklenip testrunner çalıştırınca false
		// dönecek
		assertEquals(message, messageUtil.printMessage());
	}

}

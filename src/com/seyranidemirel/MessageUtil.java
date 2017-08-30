package com.seyranidemirel;

public class MessageUtil {

	private final String message;

	// Constructer

	public MessageUtil(final String message) {
		this.message = message;
	}

	// print the message

	public String printMessage() {
		System.out.println(message);
		return message;
	}

}

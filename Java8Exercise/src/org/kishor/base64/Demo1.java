package org.kishor.base64;

import java.util.Base64;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base64.Encoder encoder = Base64.getEncoder();
		Base64.Decoder decoder = Base64.getDecoder();
		String src = "Hello\nHow are you";
		String encString = encoder.encodeToString(src.getBytes());
		String decString = new String(decoder.decode(encString));
		System.out.println("Source : "+src);
		System.out.println("Encoded : "+encString);
		System.out.println("Decoded : "+decString);

	}

}

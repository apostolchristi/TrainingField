package com.company.patterns.structural.decorator.example2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Client {

	public static void main(String[] args) {

		int c;
		StringBuffer stringBuffer = new StringBuffer("Jason Fedin aaaBBBcccDDD");
		byte[] bytes = stringBuffer.toString().getBytes();


		try (InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(bytes))){
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

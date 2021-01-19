package com.syntax.iq;

public class IQ1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);

		String str1 = "Hello";
		String str2 = "World";
		str1 = str1 + str2; // HelloWorld
		str2 = str1.substring(0, str1.length() - str2.length()); // Hello
		str1 = str1.substring(str1.length() - str2.length());
		System.out.println(str1 + " " + str2);

	}
}

//Write a program to swap 2 numbers without a temporary variable? Swap 2 strings
//without a temporary variable?

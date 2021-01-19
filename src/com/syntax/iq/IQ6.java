package com.syntax.iq;

public class IQ6 {
	public static void main(String[] args) {
		String original="addA";
		String reverse = "";
		for(int i = original.length() - 1; i >= 0; i--) {
			reverse += original.charAt(i);
		}
		System.out.println(reverse);
		if(reverse.equalsIgnoreCase(original)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}

//Write a Java Program to find whether a String is a palindrome or not.

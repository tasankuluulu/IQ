package com.syntax.iq;

public class IQ5 {
	public static void main(String[] args) {
		String original = "Hello Syntax";

		// 1st way
		String reverse = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse += original.charAt(i);
		}
		System.out.println(reverse);

		// 2nd way
		String str = "";
		char[] array = original.toCharArray();
		for (int i = array.length - 1; i >= 0; i--) {
			str += array[i];
		}
		System.out.println(str);
	}
}

//Write a java program to reverse String? Reverse a string word by word?

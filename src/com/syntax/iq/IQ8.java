package com.syntax.iq;

public class IQ8 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int sum;
		for (int i = 0; i < 10; i++) {
			System.out.print(num1 + " ");
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}

}

//Write a Java Program to print the first 10 numbers of Fibonacci series.

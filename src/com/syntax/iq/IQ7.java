package com.syntax.iq;

import java.util.Scanner;

public class IQ7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean isPrime = true;
		if(num <=1) {
			isPrime = false;
		} else if (num > 2) {
			for(int i = 2; i <= num / 2; i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		System.out.println(isPrime);
		scan.close();
	}
}

//Write a java program to check whether a given number is prime or not?

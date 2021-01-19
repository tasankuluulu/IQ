package com.syntax.iq;

import java.util.Arrays;
import java.util.TreeSet;

public class IQ2 {
	public static void main(String[] args) {
		int[] array = { -2, -5, 10, 100, 54 };
		// 1st option

		Arrays.sort(array);
		System.out.println(array[array.length - 2]);
		System.out.println(array[0]);

		// 2nd way
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max > array[i]) {
				max = array[i - 1];
				array[i - 1] = array[i];
				array[i] = max;
			}
		}
		System.out.println(array[array.length - 2]);
		System.out.println(array[0]);

	}

}

//Write a java program to find the second largest number in the array? Maximum
//and minimum number in the array?

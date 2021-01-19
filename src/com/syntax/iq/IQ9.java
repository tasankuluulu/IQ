package com.syntax.iq;

import java.util.ArrayList;
import java.util.HashSet;

public class IQ9 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		array.add("a");
		array.add("b");
		array.add("c");
		array.add("a");
		HashSet<String> set = new HashSet<>();
		set.addAll(array);
		System.out.println(set);
	}
}

//How can you remove all duplicates from ArrayList?

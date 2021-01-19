package com.syntax.iq;

public class IQ3 {
	public static void main(String[] args) {
		String given = "wefeqf878979797fewfewrf879797efds&^&^*^*^";
		given = given.replaceAll("[^A-Za-z]", "");
		System.out.println(given.length());
	}

}

//Find out how many alpha characters are present in a string?
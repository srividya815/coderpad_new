package com.vids.may14;

import java.util.Arrays;

public class Anagram {

	private static boolean isAnagram(String input1, String input2) {

		// Remove any space and convert to lowercase
		input1 = input1.replaceAll("\\s", "").toLowerCase();
		input2 = input2.replaceAll("\\s", "").toLowerCase();

		char[] input1Array = input1.toCharArray();
		char[] input2Array = input2.toCharArray();

		Arrays.sort(input1Array);
		Arrays.sort(input2Array);

		return Arrays.equals(input1Array, input2Array);

	}

	public static void main(String[] args) {
		System.out.println(isAnagram("STOP123", "TOPS"));
		System.out.println(isAnagram("DORMITORY", "DIRTY ROOM"));
		
	}

}

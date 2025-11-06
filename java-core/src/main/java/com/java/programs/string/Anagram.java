package com.java.programs.string;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// check if two strings are anagrams
		Anagram objectAnagram = new Anagram();
		System.out.println(objectAnagram.checkAnagrams("listen", "silent"));
		System.out.println(objectAnagram.checkAnagrams("listen", "silet"));
		System.out.println(objectAnagram.checkAnagrams("listen", "solent"));
	}

	public String checkAnagrams(String input1, String input2) {
		char[] ch1 = input1.toCharArray();
		char[] ch2 = input2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			return "Anagram";
		} else {
			return "Not Anagram";
		}

	}

}

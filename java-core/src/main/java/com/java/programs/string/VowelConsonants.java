package com.java.programs.string;

public class VowelConsonants {

	public static void main(String[] args) {
		// Publish the count of vowel and consonants
		VowelConsonants objectVowelConsonants = new VowelConsonants();
		objectVowelConsonants.countVowelConsonants("This is a the test string");

	}

	public void countVowelConsonants(String input) {
		int vowel = 0, consonants = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o'
					|| input.charAt(i) == 'u') {
				vowel = vowel + 1;
			} else {
				consonants = consonants + 1;
			}
		}
		System.out
				.println(String.format("In the given string %s the count of vowel is %s and count of consonants is %s",
						input, vowel, consonants));
	}

}

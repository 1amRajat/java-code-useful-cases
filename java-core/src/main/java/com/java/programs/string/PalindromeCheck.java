package com.java.programs.string;

public class PalindromeCheck {
	// Check if a string is palindrome, means when reversed its a same string

	public static void main(String[] args) {
		PalindromeCheck objectPalindrome = new PalindromeCheck();
			System.out.println(objectPalindrome.checkPalindrome("madam"));
			System.out.println(objectPalindrome.checkPalindrome("tiger"));
	}
	
	public boolean checkPalindrome(String input) {
		StringBuilder sb = new StringBuilder();
		for(int i=input.length()-1; i>= 0; i--)
		{
			sb.append(input.charAt(i));
		}
		String output = sb.toString();
		if(output.equals(input)) {
			return true;
		}
		else
		{
			return false;
		}
	}

}

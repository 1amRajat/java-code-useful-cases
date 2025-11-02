package com.java.programs.string;

public class StringReversal {

	public static void main(String[] args) {
		// Reverse a string without using in built reversal method
		StringReversal objectStringReversal = new StringReversal();
		System.out.println(objectStringReversal.reverseString("ThisIsInputString"));		
	}
	
	public String reverseString(String input)
	{
		StringBuilder sb = new StringBuilder();
		char c;
		for(int i=input.length()-1; i>=0; i--)
		{
			c = input.charAt(i);
			sb.append(c);			
		}
		return sb.toString();
	}

}

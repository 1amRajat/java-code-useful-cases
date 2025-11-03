package com.java.programs.string;

public class CharStringReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ThisIsTestInputForStringChar";
		
		System.out.println("This is for Char through array");
		char[] ch = a.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("This is for String through array");
		
		for(int j =0; j<a.length(); j++)
		{
			System.out.println(a.charAt(j));
		}

	}

}

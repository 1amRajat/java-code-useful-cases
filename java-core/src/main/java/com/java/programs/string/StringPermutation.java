package com.java.programs.string;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
	public static List<String> getPermutations(String str) {
		List<String> result = new ArrayList<String>();
		permute("", str, result);
		return result;
	}

	private static void permute(String prefix, String remaining, List<String> result) {
		if (remaining.isEmpty()) {
			result.add(prefix);
			return;
		}
		for (int i = 0; i < remaining.length(); i++) {
			permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), result);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPermutations("abc"));

	}

}

package com.java.programs.string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Remove the duplicate character from the string
		RemoveDuplicates objRemove = new RemoveDuplicates();
		objRemove.removeDuplicate("This is a duplicate string");

	}

	public void removeDuplicate(String input) {
		StringBuilder sb = new StringBuilder();
		LinkedHashSet<Character> lsSet = new LinkedHashSet<Character>();
		ArrayList<Integer> arList = new ArrayList<Integer>();
		for (int i = 0; i < input.length(); i++) {
			lsSet.add(input.charAt(i));
		}

		Iterator it = lsSet.iterator();
		while (it.hasNext()) {
			sb.append(it.next());
		}
		System.out.println(sb.toString());
	}
}

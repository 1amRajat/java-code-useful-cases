package com.java.programs.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class FirstNonRepeatCharacter {

	public static void main(String[] args) {
		// First non repeat character in a string
		FirstNonRepeatCharacter objectNonRepeat = new FirstNonRepeatCharacter();
		objectNonRepeat.checkFirstNonRepeat("lullaby");
		objectNonRepeat.checkFirstNonRepeat("abababa");
		objectNonRepeat.checkFirstNonRepeat("lxmjfdft");
	}

	public void checkFirstNonRepeat(String input) {
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		ArrayList<Integer> arList = new ArrayList<Integer>();
		for (int i = 0; i < input.length(); i++) {
			hs.add(input.charAt(i));
		}
		// System.out.println(hs);
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			int count = 0;
			char c = (Character) it.next();
			for (int j = 0; j < input.length(); j++) {
				if (c == input.charAt(j)) {
					count++;
				}
			}
			arList.add(count);
			if (count == 1) {
				System.out.println(c);
				break;
			}
		}
		if (!arList.contains(1)) {
			System.out.println("No duplocate records");
		}
	}
}

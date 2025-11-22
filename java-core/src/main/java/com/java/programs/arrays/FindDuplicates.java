package com.java.programs.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class FindDuplicates {
	
	public void findDuplicate(int[] inputArray) {
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i=0; i<inputArray.length; i++) {
			hs.add(inputArray[i]);
		}
		Iterator<Integer> i = hs.iterator();
		while(i.hasNext())
		{
			int a = i.next();
			int count = 0;
			for(int j=0; j<inputArray.length; j++) {
				if(inputArray[j]==a) {
					count++;
					if(count>1)
					{
						ar.add(inputArray[j]);
						break;
					}					
				}				
			}
		}
		System.out.println(ar);
	}

	public static void main(String[] args) {
		// Find duplicates from an array
		FindDuplicates objectDuplicate = new FindDuplicates();
		int[] aray = {1,3,2,1,4,6,8,3};
		objectDuplicate.findDuplicate(aray);

	}

}

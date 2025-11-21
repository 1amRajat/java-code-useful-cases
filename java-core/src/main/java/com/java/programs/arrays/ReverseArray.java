package com.java.programs.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
	public void arrayReverse(int[] arr) {
		Arrays.sort(arr);
		int len = arr.length;
		int[] sec = new int[len];
		for (int i = len - 1; i >= 0; i--) {
			sec[len - i - 1] = arr[i];
		}
		System.out.println(Arrays.toString(sec));
	}

	public static void main(String[] args) {
		// Reverse an array
		int[] arrayVal = { 3, 4, 6, 2, 5, 3 };
		ReverseArray objReverse = new ReverseArray();
		objReverse.arrayReverse(arrayVal);

	}

}

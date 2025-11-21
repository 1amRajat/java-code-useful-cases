package com.java.programs.arrays;

import java.util.Arrays;

public class MaxMin {

	public void arrayMinMax(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Min value is " + arr[0]);
		System.out.println("Max value is " + arr[arr.length - 1]);
	}

	public static void main(String[] args) {
		// Find the min and max element of an array
		int[] arr1 = { 2, 3, 4, 6, 1, 5, 4 };
		MaxMin objMinMax = new MaxMin();
		objMinMax.arrayMinMax(arr1);

	}

}

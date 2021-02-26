package com.generics;

public class GenericsFindMaximum {

	public static <T extends Comparable<T>> void findmax(T[] element) {
		T max = element[0];
		for (T i : element) {
			if (i.compareTo(max) > 0) {
				max = i;
			}
		}
		System.out.println("Maximum value in array is " + max);

	}

	public static <T extends Comparable<T>> void findmaxString(T[] element) {
		T max = element[0];
		int maxLength = element[0].toString().length();
		for (T i : element) {
			if (i.compareTo(max) > maxLength) {
				max = i;
				maxLength = ((String) element[(int) i]).length();
			}
		}
		System.out.println(maxLength);
		System.out.println("the maximum value in array is " + max);

	}

	public static <E> void printArray(E[] element) {
		for (E i : element) {
			System.out.println(i + " ");
			System.out.println();
		}
	}

	public static void main(String args[]) {

		Integer[] intArray = { 10, 55, 24, 97 };
		Float[] floatArray = {  4f, 9f, 3f, 10f };
		Double[] doubleArray = { 2.1, 11.2, 3.11, 67.8, 25.36, 74.0 };
		String[] stringArray = { "Sheyash", "Dhoni", "Johnson", "Sachin" };

		printArray(intArray);
		printArray(floatArray);
		printArray(doubleArray);
		printArray(stringArray);

		findmax(intArray);
		findmax(floatArray);
		findmax(doubleArray);
		findmaxString(stringArray);

	}

}

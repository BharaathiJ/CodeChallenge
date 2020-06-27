package com.org.app.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationService {

	private PermutationService() {

	}

	/**
	 * To check the swap is required for the cursor position
	 * 
	 * @param arr    contains list of integer values
	 * @param start  defines the start position of the array
	 * @param curPos defines the current position
	 * @return
	 */
	static boolean swapRequired(int[] arr, int start, int curPos) {
		for (int i = start; i < curPos; i++) {
			if (arr[i] == arr[curPos]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Recursive method to generate the unique permutation based on the given
	 * integer array
	 * 
	 * @param arr    contains list of integer values
	 * @param index  defines the position of the current index
	 * @param n      defines the size of the elements
	 * @param result contains the unique permutation list
	 */
	public static void generateUniquePermutations(int[] arr, int index, int n, List<List<Integer>> result) {
		if (arr.length == 0) {
			return;
		}

		if (index == arr.length - 1) {
			List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
			result.add(list);
			return;
		}
		for (int i = index; i < n; i++) {

			// Proceed further for arr[i] only if it doesn't match with any of the integer
			// values after arr[index]

			boolean check = swapRequired(arr, index, i);
			if (check) {
				swap(arr, index, i);
				generateUniquePermutations(arr, index + 1, n, result);
				swap(arr, index, i);
			}
		}

	}

	/**
	 * Swaps the elements in the given array using the position
	 * 
	 * @param arr contains list of integer values
	 * @param i   defines the swap element position
	 * @param j   defines the swap element position
	 */
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}

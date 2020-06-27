package com.org.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class PermutationService {
	// Since all collections are static members
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
	 * To generate the unique permutation based on the given list of numbers
	 * 
	 * @param arr     contains list of integer values
	 * @param defines the index position
	 * @param n       defines the size of the elements
	 * @return
	 */
	public static List<List<Integer>> generateUniquePermutations(int[] arr) {
		if (Objects.isNull(arr) || arr.length == 0) {
			return Collections.emptyList();
		}

		List<List<Integer>> uniquePermutationList = new ArrayList<>();
		generateUniquePermutationsRecursive(arr, 0, arr.length, uniquePermutationList);

		return uniquePermutationList;
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
	public static void generateUniquePermutationsRecursive(int[] arr, int index, int n, List<List<Integer>> result) {
		if (index == arr.length - 1) {
			result.add(Arrays.stream(arr).boxed().collect(Collectors.toList()));
			return;
		}
		for (int i = index; i < n; i++) {
			// Proceed further for arr[i] only if it doesn't match with any of the integer
			// values after arr[index]
			if (swapRequired(arr, index, i)) {
				swap(arr, index, i);
				generateUniquePermutationsRecursive(arr, index + 1, n, result);
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
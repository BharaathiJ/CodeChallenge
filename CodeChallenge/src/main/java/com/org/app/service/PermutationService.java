package com.org.app.service;

import java.util.ArrayList;
import java.util.List;

public class PermutationService {
	
	static boolean swapRequired(int arr[], int start, int curPos) {
		for (int i = start; i < curPos; i++) {
			if (arr[i] == arr[curPos]) {
				return false;
			}
		}
		return true;
	}

	public static void generateUniquePermutations(int arr[], int index, int n, List<List<Integer>> result) {
		if (arr.length == 0) {
			return;
		}
		if (index == arr.length - 1) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int num : arr) {
				list.add(num);
			}
			result.add(list);
			return;
		}
		for (int i = index; i < n; i++) {

			/** Proceed further for arr[i] only if it doesn't match with any of the integer values after arr[index]
			 * 
			 */
			boolean check = swapRequired(arr, index, i);
			if (check) {
				swap(arr, index, i);
				generateUniquePermutations(arr, index + 1, n, result);
				swap(arr, index, i);
			}
		}
		return;
	}

	static void swap(int[] arr, int i, int j) {
		int c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}

}

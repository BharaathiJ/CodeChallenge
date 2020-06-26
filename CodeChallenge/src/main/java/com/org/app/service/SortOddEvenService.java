package com.org.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortOddEvenService {

	public static void sortOddThenEven(int[] arr, List<Integer> combinedList) {
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();
		int size = arr.length;

		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				evenList.add(arr[i]);
			} else if (arr[i] % 2 != 0) {
				oddList.add(arr[i]);
			}
		}

		sortArray(evenList);
		sortArray(oddList);

		combinedList.addAll(oddList);
		combinedList.addAll(evenList);
	}

	private static void sortArray(List<Integer> arrayList) {
		Integer[] arr = arrayList.toArray(new Integer[arrayList.size()]);
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < arr[i - 1]) {
				arr[i] = arr[i] + arr[i - 1];
				arr[i - 1] = arr[i] - arr[i - 1];
				arr[i] = arr[i] - arr[i - 1];
				i = 0;

			}
		}
		arrayList = Arrays.asList(arr);
	}
}

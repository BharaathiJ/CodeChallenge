package com.org.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class SortOddEvenService {
	/**
	 * To sort a list of numbers so that odd numbers are sorted before even numbers
	 * 
	 * @param arr contains list of integer values
	 * @return sorted array with odd numbers sorted first then even numbers
	 */
	public List<Integer> sortOddThenEven(int[] arr) {
		if (Objects.nonNull(arr) && arr.length > 0) {
			List<Integer> combinedList = new ArrayList<>();
			List<Integer> evenList = new ArrayList<>();
			List<Integer> oddList = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0)
					evenList.add(arr[i]);
				else
					oddList.add(arr[i]);
			}
			evenList = sortArray(evenList);
			oddList = sortArray(oddList);
			combinedList.addAll(oddList);
			combinedList.addAll(evenList);
			return combinedList;
		}
		return Collections.emptyList();
	}

	/**
	 * To sort the given array list in ascending order
	 * 
	 * @param arrayList contains list of integer values
	 * @return sorted array list
	 */
	private List<Integer> sortArray(List<Integer> arrayList) {
		Integer[] arr = arrayList.toArray(new Integer[arrayList.size()]);
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return Arrays.asList(arr);
	}
}
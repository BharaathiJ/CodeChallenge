package com.org.app.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class SortOddEvenServiceTest {
	SortOddEvenService sortOddEvenService = new SortOddEvenService();

	@Test
	public void sortOddThenEvenUnorderListTest() {
		int[] arrayListToSort = new int[] { 1, 7, 6, 5, 3, 4, 16, 2 };
		List<Integer> expectedList = Arrays.asList(new Integer[] { 1, 3, 5, 7, 2, 4, 6, 16 });
		List<Integer> sortedList = sortOddEvenService.sortOddThenEven(arrayListToSort);
		expectedList.forEach(expectedOject -> assertTrue(sortedList.contains(expectedOject)));
		assertEquals(expectedList, sortedList);
	}

	@Test
	public void sortOddThenEvenOrderListTest() {
		int[] arrayListToSort = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> expectedList = Arrays.asList(new Integer[] { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 });
		List<Integer> sortedList = sortOddEvenService.sortOddThenEven(arrayListToSort);
		expectedList.forEach(expectedOject -> assertTrue(sortedList.contains(expectedOject)));
		assertEquals(expectedList, sortedList);
	}

	@Test
	public void sortOddThenEvenNullTest() {
		List<Integer> sortedList = sortOddEvenService.sortOddThenEven(null);
		assertEquals(Collections.emptyList(), sortedList);
	}

	@Test
	public void sortOddThenEvenEmptyArrayTest() {
		List<Integer> sortedList = sortOddEvenService.sortOddThenEven(new int[0]);
		assertEquals(Collections.emptyList(), sortedList);
	}
}
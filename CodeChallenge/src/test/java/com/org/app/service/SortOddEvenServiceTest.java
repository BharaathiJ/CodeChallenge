package com.org.app.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SortOddEvenServiceTest {

	@Test
	public void sortOddThenEvenTest() {
		int[] arrayListToSort = new int[] { 1, 7, 6, 5, 3, 4, 16, 2 };
		List<Integer> expectedList = Arrays.asList(new Integer[] { 1, 3, 5, 7, 2, 4, 6, 16 });
		List<Integer> sortedList = SortOddEvenService.sortOddThenEven(arrayListToSort);
		assertEquals(expectedList, sortedList);
	}

}

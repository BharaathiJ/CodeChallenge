package com.org.app.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SortOddEvenServiceTest {

	private int[] arrayListToSort;

	@Before
	public void setUp() throws Exception {
		arrayListToSort = new int[] { 1, 3, 2, 4, 7, 16 };
	}

	@Test
	public void sortOddThenEvenTest() {
		List<Integer> sortedList = new ArrayList<Integer>();
		List<Integer> expectedList = Arrays.asList(new Integer[] { 1, 3, 7, 2, 4, 16 });
		SortOddEvenService.sortOddThenEven(arrayListToSort, sortedList);
		assertEquals(expectedList, sortedList);
	}
}

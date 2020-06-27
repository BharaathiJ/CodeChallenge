package com.org.app.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class PermutationServiceTest {

	@Test
	public void generateUniquePermutationsWithSameValueTest() {
		int[] arrayList = new int[] { 1, 2, 3, 3 };
		List<List<Integer>> uniquePermutations = Collections.emptyList();
		if (arrayList.length > 0)
			uniquePermutations = new ArrayList<>();

		PermutationService.generateUniquePermutations(arrayList, 0, arrayList.length, uniquePermutations);

		Integer[][] expectedIntegerArray = new Integer[][] { { 1, 2, 3, 3 }, { 1, 3, 2, 3 }, { 1, 3, 3, 2 },
				{ 2, 1, 3, 3 }, { 2, 3, 1, 3 }, { 2, 3, 3, 1 }, { 3, 2, 1, 3 }, { 3, 2, 3, 1 }, { 3, 1, 2, 3 },
				{ 3, 1, 3, 2 }, { 3, 3, 1, 2 }, { 3, 3, 2, 1 } };
		List<List<Integer>> expectedList = Arrays.stream(expectedIntegerArray).map(Arrays::asList)
				.collect(Collectors.toList());

		assertEquals(expectedList, uniquePermutations);
	}

	@Test
	public void generateUniquePermutationsWithDifferentValueTest() {
		int[] arrayList = new int[] { 1, 2, 3, 4 };
		List<List<Integer>> uniquePermutations = Collections.emptyList();
		if (arrayList.length > 0)
			uniquePermutations = new ArrayList<>();

		PermutationService.generateUniquePermutations(arrayList, 0, arrayList.length, uniquePermutations);

		Integer[][] expectedIntegerArray = new Integer[][] { { 1, 2, 3, 4 }, { 1, 2, 4, 3 }, { 1, 3, 2, 4 },
				{ 1, 3, 4, 2 }, { 1, 4, 3, 2 }, { 1, 4, 2, 3 }, { 2, 1, 3, 4 }, { 2, 1, 4, 3 }, { 2, 3, 1, 4 },
				{ 2, 3, 4, 1 }, { 2, 4, 3, 1 }, { 2, 4, 1, 3 }, { 3, 2, 1, 4 }, { 3, 2, 4, 1 }, { 3, 1, 2, 4 },
				{ 3, 1, 4, 2 }, { 3, 4, 1, 2 }, { 3, 4, 2, 1 }, { 4, 2, 3, 1 }, { 4, 2, 1, 3 }, { 4, 3, 2, 1 },
				{ 4, 3, 1, 2 }, { 4, 1, 3, 2 }, { 4, 1, 2, 3 } };
		List<List<Integer>> expectedList = Arrays.stream(expectedIntegerArray).map(Arrays::asList)
				.collect(Collectors.toList());

		assertEquals(expectedList, uniquePermutations);
	}

}

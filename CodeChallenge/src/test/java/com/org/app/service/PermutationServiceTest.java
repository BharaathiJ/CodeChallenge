package com.org.app.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class PermutationServiceTest {

	@Test
	public void generateUniquePermutationsWithSameValueTest() {
		int[] arrayList = new int[] { 1, 2, 3, 3 };
		List<List<Integer>> uniquePermutations = PermutationService.generateUniquePermutations(arrayList);
		List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(1, 2, 3, 3), Arrays.asList(1, 3, 2, 3),
				Arrays.asList(1, 3, 3, 2), Arrays.asList(2, 1, 3, 3), Arrays.asList(2, 3, 1, 3),
				Arrays.asList(2, 3, 3, 1), Arrays.asList(3, 2, 1, 3), Arrays.asList(3, 2, 3, 1),
				Arrays.asList(3, 1, 2, 3), Arrays.asList(3, 1, 3, 2), Arrays.asList(3, 3, 1, 2),
				Arrays.asList(3, 3, 2, 1));
		expectedList.forEach(expectedOject -> assertTrue(uniquePermutations.contains(expectedOject)));
		assertEquals(expectedList, uniquePermutations);
	}

	@Test
	public void generateUniquePermutationsWithDifferentValueTest() {
		int[] arrayList = new int[] { 1, 2, 3, 4 };
		List<List<Integer>> uniquePermutations = PermutationService.generateUniquePermutations(arrayList);
		List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(1, 2, 3, 4), Arrays.asList(1, 2, 4, 3),
				Arrays.asList(1, 3, 2, 4), Arrays.asList(1, 3, 4, 2), Arrays.asList(1, 4, 3, 2),
				Arrays.asList(1, 4, 2, 3), Arrays.asList(2, 1, 3, 4), Arrays.asList(2, 1, 4, 3),
				Arrays.asList(2, 3, 1, 4), Arrays.asList(2, 3, 4, 1), Arrays.asList(2, 4, 3, 1),
				Arrays.asList(2, 4, 1, 3), Arrays.asList(3, 2, 1, 4), Arrays.asList(3, 2, 4, 1),
				Arrays.asList(3, 1, 2, 4), Arrays.asList(3, 1, 4, 2), Arrays.asList(3, 4, 1, 2),
				Arrays.asList(3, 4, 2, 1), Arrays.asList(4, 2, 3, 1), Arrays.asList(4, 2, 1, 3),
				Arrays.asList(4, 3, 2, 1), Arrays.asList(4, 3, 1, 2), Arrays.asList(4, 1, 3, 2),
				Arrays.asList(4, 1, 2, 3));
		expectedList.forEach(expectedOject -> assertTrue(uniquePermutations.contains(expectedOject)));
		assertEquals(expectedList, uniquePermutations);
	}

	@Test
	public void generateUniquePermutationsNullTest() {
		List<List<Integer>> uniquePermutations = PermutationService.generateUniquePermutations(null);
		assertEquals(Collections.emptyList(), uniquePermutations);
	}

	@Test
	public void generateUniquePermutationsEmptyTest() {
		List<List<Integer>> uniquePermutations = PermutationService.generateUniquePermutations(new int[0]);
		assertEquals(Collections.emptyList(), uniquePermutations);
	}
}
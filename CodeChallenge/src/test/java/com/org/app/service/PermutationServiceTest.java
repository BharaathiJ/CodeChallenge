package com.org.app.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PermutationServiceTest {

	@Test
	public void generateUniquePermutationsWithSameValueTest() {
		int[] arrayList = new int[] { 1, 2, 3, 3 };
		List<List<Integer>> uniquePermutations = new ArrayList<List<Integer>>();
		PermutationService.generateUniquePermutations(arrayList, 0, arrayList.length, uniquePermutations);
		assertEquals(12, uniquePermutations.size());
	}

	@Test
	public void generateUniquePermutationsWithDifferentValueTest() {
		int[] arrayList = new int[] { 1, 2, 3, 4 };
		List<List<Integer>> uniquePermutations = new ArrayList<List<Integer>>();
		PermutationService.generateUniquePermutations(arrayList, 0, arrayList.length, uniquePermutations);
		assertEquals(24, uniquePermutations.size());
	}

}

package com.org.app;

import java.util.List;
import java.util.logging.Logger;

import com.org.app.service.PermutationService;
import com.org.app.service.SortOddEvenService;

public class CodeChallengeApplication {

	public static final Logger logger = Logger.getLogger("CodeChallengeApplication");

	public static void main(String[] args) {
		int[] arrayValue = new int[] { 1, 2, 3, 4 };
		PermutationService permutationService = new PermutationService();
		List<List<Integer>> permutationList = permutationService.generateUniquePermutations(arrayValue);
		logger.info("----Unique Permutations--------");
		permutationList.stream().forEach(i -> logger.info(i.toString()));
		logger.info("----Sorting Numbers--------");
		SortOddEvenService sortOddEvenService = new SortOddEvenService();
		List<Integer> combinedList = sortOddEvenService.sortOddThenEven(arrayValue);
		combinedList.stream().forEach(i -> logger.info(i.toString()));
	}
}
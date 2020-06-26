package com.org.app;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.org.app.service.PermutationService;
import com.org.app.service.SortOddEvenService;

public class CodeChallengeApplication {

	public static Logger logger = Logger.getLogger("CodeChallengeApplication");

	public static void main(String[] args) {
		int[] arrayValue = new int[] { 1, 2, 3, 4, 5 };

		List<List<Integer>> permutationList = new ArrayList<List<Integer>>();
		PermutationService.generateUniquePermutations(arrayValue, 0, arrayValue.length, permutationList);
		logger.info("----Unique Permutations--------");
		for (List<Integer> permutationArray : permutationList) {
			logger.info(permutationArray.toString());
		}

		logger.info("----Sorting Numbers--------");

		List<Integer> combinedList = new ArrayList<Integer>();
		SortOddEvenService.sortOddThenEven(arrayValue, combinedList);
		logger.info(combinedList.toString());

	}

}

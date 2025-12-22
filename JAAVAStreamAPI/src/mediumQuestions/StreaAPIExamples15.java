package mediumQuestions;

import java.util.List;

public class StreaAPIExamples15 {

	public static void main(String[] args) {
		// Given a list of numbers, skip the first 3 and print the rest.

		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
		
		numbers.stream()
				.skip(3).forEach(System.out::println);
		
	}

}

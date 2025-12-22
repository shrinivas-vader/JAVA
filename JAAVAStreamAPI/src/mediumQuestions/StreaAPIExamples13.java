package mediumQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreaAPIExamples13 {

	public static void main(String[] args) {
		//Given a list of strings, find the longest string.

		List<String> names = List.of("shrinivas","abhay1111111","akshay","aarti","sbhay1111111");
		
		Optional<String> longestName = names.stream()
				.max(Comparator.comparing(String::length));
				
		System.out.println(longestName.get());

	}

}

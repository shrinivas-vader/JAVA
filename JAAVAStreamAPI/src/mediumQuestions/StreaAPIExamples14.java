package mediumQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class StreaAPIExamples14 {

	public static void main(String[] args) {
		// Given a list of words, create a single string containing all words separated by commas.

		List<String> names = List.of("shrinivas","shekar","amey");
		
		String consolidetedWord = names.stream()
				.collect(Collectors.joining(","));
		
		System.out.println(consolidetedWord);
	}

}

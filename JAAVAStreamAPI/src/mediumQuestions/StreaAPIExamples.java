package mediumQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreaAPIExamples {

	public static void main(String[] args) {
		// Convert a list of strings to a Map<String, Integer> where the key is the word and the value is its length.

		List<String> names =List.of("shrinivas","vijay","vishal");
		
		Map<String,Integer> listToMap = names.stream()
				.collect(Collectors.toMap(word->word, word->word.length()));
		
		System.out.println(listToMap);

	}

}

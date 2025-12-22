package mediumQuestions;

import java.util.List;

public class StreamAPIExamples16 {

	public static void main(String[] args) {
		// Limit a list to only the first 5 elements and print them.
		
		List<String> names = List.of("Shrinivas","abhay","arun","smita","sangita","Amruta");
		
		List<String> processedData = names.stream()
				.limit(5)
				.toList();
		
		System.out.println(processedData);
	}

}

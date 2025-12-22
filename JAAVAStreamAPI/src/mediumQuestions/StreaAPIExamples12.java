package mediumQuestions;

import java.util.List;
import java.util.Optional;

public class StreaAPIExamples12 {

	public static void main(String[] args) {
		//Find the maximum and minimum number in a list using streams
		
		List<Integer> numbers = List.of(2,1,4,5,6,88);
		
		int max = numbers.stream()
				.max(Integer :: compare)
				.orElseThrow();
		
		Optional<Integer> min = numbers.stream()
				.sorted()
				.findFirst();
		System.out.println(max);

		System.out.println(min.get());
	}
}

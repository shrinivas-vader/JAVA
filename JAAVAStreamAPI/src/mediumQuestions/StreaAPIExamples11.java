package mediumQuestions;

import java.util.List;

public class StreaAPIExamples11 {

	public static void main(String[] args) {
		// Given a list of integers, find the sum of all even numbers
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		
		int sum = numbers.stream()
				.filter(n->n%2==0)
				.mapToInt(Integer::intValue)
				.sum();
		
		System.out.println(sum);

	}

}

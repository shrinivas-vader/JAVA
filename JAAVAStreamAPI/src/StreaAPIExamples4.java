import java.util.List;

public class StreaAPIExamples4 {

	public static void main(String[] args) {
		// From a list of integers, find all numbers greater than 10 and less than 50.
		
		List<Integer> numbers = List.of(1,4,55,5,49,33,56,77);
		
		List<Integer> processedNumbers = numbers.stream()
				.filter(num-> num<50 && num>10)
				.toList();
				
		System.out.println(processedNumbers);

	}

}

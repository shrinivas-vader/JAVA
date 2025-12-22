import java.util.List;

public class StreaAPIExamples7 {

	public static void main(String[] args) {
		//Remove duplicates from a list of integers using distinct().
		
		List<Integer> numbers = List.of(1,2,2,3,4,4,5,6,7);
		
		List<Integer> processedNumbers = numbers.stream()
				.distinct()
				.toList();
		
		System.out.println(processedNumbers);
	}
}

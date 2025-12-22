import java.util.List;

public class StreaAPIExamples9 {

	public static void main(String[] args) {
		// Check if any number in the list is divisible by 7 (use anyMatch())
		
		List<Integer> numbers =List.of(5,7,33,211);
		
		Boolean isAvailable = numbers.stream()
				.anyMatch(num->num%7==0);
		
		System.out.println(isAvailable);

	}

}

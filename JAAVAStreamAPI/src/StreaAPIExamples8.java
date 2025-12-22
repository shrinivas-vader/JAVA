import java.util.List;
import java.util.Optional;

public class StreaAPIExamples8 {

	public static void main(String[] args) {
		// Find the first element in a list greater than 100 (use findFirst())
		
		List<Integer> numbers = List.of(104,105,111,103);
		
		Optional<Integer> number = numbers.stream()
				.filter(num->num>100)
				.findFirst();
		
		System.out.println(number.get());

	}

}

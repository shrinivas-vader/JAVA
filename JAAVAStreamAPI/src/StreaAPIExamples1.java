import java.util.List;

public class StreaAPIExamples1 {

	public static void main(String[] args) {
//Given a list of integers, print only the even numbers.
		List<Integer> numbers = List.of(1,4,3,88,22,56,33,44);
		
		List<Integer> processedNumbers = numbers.stream()
				.filter(n -> n%2 ==0)
				.toList();
		
		System.out.println(processedNumbers);
	}

}

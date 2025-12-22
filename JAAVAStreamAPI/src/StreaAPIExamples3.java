import java.util.List;

public class StreaAPIExamples3 {
//Convert a list of integers into a list of their squares.
	public static void main(String[] args) {
	
		List<Integer> numbers = List.of(1,3,4,5,66,7);
		
		List<Integer> prosessedNumbers = numbers.stream()
				.map(n->n*n)
				.toList();
		
		System.out.println(prosessedNumbers);
	}
}

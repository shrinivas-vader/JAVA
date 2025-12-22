import java.util.List;

public class StreaAPIExamples6 {

	public static void main(String[] args) {
		// Sort a list of strings alphabetically using streams.
		
		List<String> names = List.of("Shrinivas","Amit","Rashi");
		
		List<String> processedNames = names.stream()
				.sorted()
				.toList();
		
		System.out.println(processedNames);
				

	}

}

import java.util.List;

public class StreaAPIExamples2 {

	public static void main(String[] args) {
		// Given a list of names, print all names in uppercase using map().
		
		List<String> names = List.of("shrinivas","abhay","amit","Subhas");
		
		List<String> processedNames = names.stream()
				.map(name -> name.toUpperCase())
				.toList();
		
		System.out.println(processedNames);

	}

}

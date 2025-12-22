import java.util.List;

public class StreaAPIExamples {

	public static void main(String[] args) {
//Convert a List<String> into a stream and print all elements.
		List<String> names = List.of("Akshy","suraj","vijay","Smita");
		
		List<String> processedNames = names.stream()
				.toList();
		
		System.out.println(processedNames);
	}

}

import java.util.List;

public class StreaAPIExamples5 {

	public static void main(String[] args) {
		// Count how many strings in a list start with the letter "A"
		
		List<String> names = List.of("shrinivas","Akshay","Ameet","Asujit");
		
		Long count = names.stream()
				.filter(name -> name.startsWith("A"))
				.count();
		
		System.out.println(count);
		
	}
}

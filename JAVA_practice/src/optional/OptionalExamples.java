package optional;

import java.util.Optional;

public class OptionalExamples {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Optional<Object> optionalEx = Optional.ofNullable(null);
		System.out.println(optionalEx.toString());	
	}
}

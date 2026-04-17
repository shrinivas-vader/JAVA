package optional;

import java.util.Optional;

public class OptionalEx1 {

	public static void main(String[] args) {
		
		Optional<String> str = Optional.ofNullable("shri");
			str = null;
		System.out.println(str.get());
		
				}
}

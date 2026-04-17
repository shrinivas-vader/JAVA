package predicateExample;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		Predicate<Integer> predEx = n -> n%2 ==0;
		
		Predicate<String> predEx1 = n -> n.contentEquals("babloo");
		
		System.out.println(predEx.test(11));
		System.out.println(predEx1.test("babloo"));
	}
}

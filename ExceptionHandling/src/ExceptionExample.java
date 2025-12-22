import java.util.List;

import Exceptions.UserNotFoundException;

public class ExceptionExample{
	
	public static void main(String[] args) {
		List<String> nameList = List.of("shrinivas","akash","vaibhav");

		try {
			String num = null;
			String[] exampleArray = new String[] {"as",null};
			
			for(String arr:exampleArray) {
				System.out.println(arr);
			}
			
			System.out.println(num);
//			int i = num;/
			
//			int i=10/0;
		} catch (NullPointerException e) {
			throw new UserNotFoundException("null value found");
		}
		

		
	}
}
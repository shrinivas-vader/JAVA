import java.util.ArrayList;
import java.util.List;

public class FindDigit {

	public static void main(String[] args) {

		int i;
		List<String> digitList = new ArrayList<String>();

		for(i=50;i<=100;i++) {
			String digit = String.valueOf(i);
			int count = 0;

			for(char c:digit.toCharArray()) {

				if(c == '7') {
					count++;
				}
				
			}
			if(count == 1) {
				System.out.println(digit);
			}
		}
		
//		System.out.println(digitList);
	}

}

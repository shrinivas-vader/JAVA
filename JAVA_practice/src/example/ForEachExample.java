package example;

import java.lang.foreign.AddressLayout;
import java.util.HashMap;
import java.util.Map;

public class ForEachExample {

	public static void main(String[] args) {
		String a[] = {"a","b","c"};
		
//		for (String data : a) {
//			System.out.println(data);
//		}
		
		Map<Integer, String> data = new HashMap<Integer, String>();
		
		data.put(1,"shrinivas");
		
		for(int i = 2;i<=5;i++) {
			data.put(i, "data"+i);
		}
		
		data.forEach((key,value) -> System.out.println(key+value));
	}
}

package listExamples;

import java.util.ArrayList;
import java.util.List;


public class ListExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		int j;
		Integer k;
		for(int i=0;i<=5;i++) {
			list.add(i);

		}
		
		for(int l:list){
			System.out.println(l);

		}
	}
}

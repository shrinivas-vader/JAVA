import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {

		List<Student> studentRecords = new ArrayList<>();
		
		studentRecords.add(new Student(2, "Amit"));
		studentRecords.add(new Student(3, "Rekha"));
		
		Collections.sort(studentRecords);
        System.out.println(studentRecords);

//		int testArray[] = new int[]{1,2,3,4};
//		for(int i:testArray) {
//			System.out.println(i);
//		}
//		System.out.println(testArray);
//		

//		
//		System.out.println(StudentRecords);
		
//		List<Student> StudentRecords = List.of(
//				new Student(3,"amit"),
//				new Student(1,"sagar")
//				);
		
//		Collections.sort(StudentRecords);
		
		
//		for(Student s:StudentRecords) {
//			System.out.println(s.id+""+s.name);
//		}
	}

}

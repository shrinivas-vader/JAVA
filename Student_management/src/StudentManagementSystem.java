import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

	static ArrayList<Student> StudentData = new ArrayList<Student>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int option = 0;
		StudentData.add(new Student("Hari", 2, 400));

		while(option!=5) {
			System.out.println("1.add student\n2.delete student\n3.show all students\nEnter choice");
			
			if(!sc.hasNextInt()) {
				System.out.println("Wrong choice bro with wrong format enter valide option in integre format");
				sc.next();
				continue;
			}
			
			option = sc.nextInt();
			switch(option) {
			case 1 -> addStudent();
			case 2 -> deleteStudent();
			case 3 -> showStudents();
			default -> System.out.println("Wrong choice. Enter correct option");
			}
		}
	}

	private static void showStudents() {
		if(StudentData.isEmpty()) {
			System.out.println("No records");
		}
		else {
			StudentData.forEach(System.out::println);
//			for (Student student : StudentData) {
//				System.out.println(student);
//			}
			
			System.out.println("===============================");
	        System.out.println(StudentData);

		}
	}

	private static void deleteStudent() {
		System.out.println("Enter student roll number");
		int roll_no = sc.nextInt();
		StudentData.removeIf(s -> s.roll_number == roll_no);
	}

	private static void addStudent() {

		System.out.println("Enter student name");
		String name = sc.next();
		System.out.println("Enter student marks");
		int marks = sc.nextInt();
		System.out.println("Enter student roll Number");
		int roll_no = sc.nextInt();
		
		StudentData.add(new Student(name, roll_no, marks));
	}
}

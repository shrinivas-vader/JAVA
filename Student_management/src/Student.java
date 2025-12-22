
public class Student {

	String name;
	int roll_number;
	int marks;

	public Student(String name, int roll_number, int marks) {
		this.name = name;
		this.roll_number = roll_number;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", roll_number=" + roll_number + ", marks=" + marks + "]";
	}
	
}

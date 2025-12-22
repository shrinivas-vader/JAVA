
import java.util.Comparator;

public class Student {

	int id;
	String name;
	
	public Student() {
		
	}
	
	Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int compareTo(Student s) {
        return this.id - s.id;   // sorting by id
    }
}

package advanceQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

 class Employee{
	int id;
	String name;
	String department;
	int salary;
	
	public Employee(int id,String name,String department, int salary) {
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
	}
}

public class StreamAPIExamples17 {

	public static void main(String[] args) {
		/*
		 * You have a list of employees (id, name, department, salary).
		 *  ➤ Find all employees with salary > 50,000. 
		 *  ➤ Find the average salary per department. 
		 *  ➤ Sort employees by salary descending.
		 *  ➤ Get a list of top 3 highest-paid employees.
		 */
		
		List<Employee> employees = List.of(
				new Employee(101,"shrinivas","IT",50000),
				new Employee(102,"sarika","HR",30000),
				new Employee(103,"sanket","DEV-OPS",40000),
				new Employee(104,"abhishek","QA",70000),
				new Employee(105,"apoorva","QA",30000));


		// ➤ Find all employees with salary > 50,000.
		List<Employee> questionOne = employees.stream()
				.filter(employeesList->employeesList.salary>50000)
				.toList();
		
		for (Employee employee : questionOne) {
			System.out.println(employee);
		}
		
		System.out.println();

		//➤ Find the average salary per department. 
		Map<String,Double> questionTwo = employees.stream()
				.collect(
						Collectors.groupingBy(
								Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)
								));
		
		questionTwo.forEach((department,avgSalary)->
			System.out.println(department+" "+avgSalary)
				);
		
		System.out.println();

		System.out.println("Before sorting");
		for(Employee employees1:employees) {
			System.out.println(employees1);
		}
		
		System.out.println();
		System.out.println("After sorting");
		
		// Sort employees by salary descending.
		
		List<Employee> questionThree = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		
		for(Employee employees1:questionThree) {
			System.out.println(employees1);
		}
		System.out.println();

		//Get a list of top 3 highest-paid employees.
		
		List<Employee> questionFour = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.limit(3)
				.collect(Collectors.toList());
		
		for(Employee e: questionFour){
			System.out.println(e);
		}
	}

}

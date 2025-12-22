package streamApiMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	
	int employeeId;
	String name;
	public Employee(int employeeId,String name) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
}

class Customer{
	String customerName;
	int amount;
	public Customer(String customerName, int amount) {
		super();
		this.customerName = customerName;
		this.amount = amount;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
}
public class StreamAPIMap {
	
	public static void main(String[] args) {
		
		List<String> onlyNames = List.of("shrinivas","abhay","jasmine","jon");
		List<Employee> employeeData = List.of(
				new Employee(1,"shrinivas"),
				new Employee(2,"Suraj")
				);
		
		/*question 1
		 Convert a list of strings into a map where the key is the string and the value is its length.

		Map<String, Integer> processedData = onlyNames.stream()
				.collect(Collectors.toMap(word -> word, word->word.length()));
		
		System.out.println(processedData);*/
//===================================================================================================================
//		question 2
//		Convert a list of employees into a map where the key is the employee ID and the value is the employee name.

		/*Map<Integer, String> employeeMap = employeeData.stream()
		        .collect(Collectors.toMap(
		                emp -> emp.getEmployeeId(),
		                emp -> emp.getName()
		        ));

		employeeMap.forEach((k, v) ->
		        System.out.printf("%d = %s%n", k, v));

	}*/
	//===================================================================================================================

	//From a list of transactions, create a map where the key is the customer and the value is the total transaction amount.

	List<Customer> customerData = List.of(
			new Customer("shrinivas",4000),
			new Customer("abay",5000),
			new Customer("chetan",7000),
			new Customer("abay",4000));
	
	Map<String,Integer> cutomerMap = customerData.stream()
			.collect(Collectors.groupingBy(
					Customer::getCustomerName, 
					Collectors.summingInt(Customer::getAmount)
					));
	
	cutomerMap.forEach((k,v)->System.out.printf("%s  %d%n", k,v));

			}
	
	
}

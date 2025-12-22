package advanceQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {
	String customer; 
	double amount;
	
	public Transaction(String customer,double amount) {
		this.amount=amount;
		this.customer=customer;
	}
	
	public String getCustomer() {
		return customer;
	}
	
	public double getAmount() {
		return amount;
	}
}

public class StreamAPIExamples18 {

	public static void main(String[] args) {
		// From a list of transactions, find the total transaction amount per customer.

		/*
		 * class Transaction { String customer; double amount; }
		 */

		List<Transaction> data = List.of(
				new Transaction("Shrinivas", 5000),
				new Transaction("Shrinivas", 4000),
				new Transaction("Abhishek", 2000),
				new Transaction("akash", 5000));
		
		Map<String, Double> processedData = data.stream()
				.collect(Collectors.groupingBy(
						Transaction::getCustomer,
						Collectors.summingDouble(Transaction::getAmount)
						));
		
				System.out.println(processedData);
	}

}

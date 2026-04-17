package functionalIntefaceEx;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		Payment upipayment  = (amount) -> {
			System.out.println("Paid by upi"+amount);
		};
		
		Payment cashpayment = (amount) ->{
			System.out.println("paid by cash"+amount);
		};
		
		upipayment.pay(1000);
		cashpayment.pay(2000);
	}
	
	
}
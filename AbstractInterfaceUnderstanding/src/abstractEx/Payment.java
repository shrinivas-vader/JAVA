package abstractEx;

public abstract class Payment {
	
	//This is abstract class.
	 void validate() {
		System.out.println("the payment is validated. Go Ahead");
	}
	
	abstract void pay();
}

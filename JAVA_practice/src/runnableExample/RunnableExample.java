package runnableExample;

public class RunnableExample {

	public static void main(String[] args) {
		
		Runnable r = () -> System.out.println("Runnable method");
		
		Thread t = new Thread(r);
		t.run();
	}
}

package Factory;

public class Car implements Transport {

	@Override
	public void deliver() {
		
		System.out.println("Successfully delivers car");
	}

}

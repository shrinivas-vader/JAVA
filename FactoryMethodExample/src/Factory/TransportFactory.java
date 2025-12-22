package Factory;

public class TransportFactory {

	public static Transport getTransport(String type) {
		if(type.equalsIgnoreCase("truck")) {
			return new Truck();
		}
		if(type.equalsIgnoreCase("car")) {
			return new Car();
		}
		return null;
	}
	
}

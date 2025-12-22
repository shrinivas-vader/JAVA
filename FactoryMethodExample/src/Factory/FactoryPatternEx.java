package Factory;

public class FactoryPatternEx {
		
		public static void main(String[] args) {
			Transport truck = TransportFactory.getTransport("truck");
			System.out.println(truck);
			if(truck != null) {
				truck.deliver();
			}
		}
}

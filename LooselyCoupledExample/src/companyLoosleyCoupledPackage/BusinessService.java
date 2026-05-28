package companyLoosleyCoupledPackage;

public class BusinessService {

	private Businesses business;
	
	public BusinessService(Businesses business) {
		this.business = business;
	}
	
	public void runBusinessOperations() {
		business.engineManufacturing();
		business.vehicleSelling();
	}
}

package databaseLooselyCoupledPackage;

public class OracleDb implements DatabaseConnection {

	@Override
	public void openConnection() {
		System.out.println("This is opening the oracle db connection");
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("This is connecting to oracle db");
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("This is getting data from oracle db");
	}

}

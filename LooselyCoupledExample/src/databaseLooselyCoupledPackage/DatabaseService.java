package databaseLooselyCoupledPackage;

public class DatabaseService {

	DatabaseConnection databaseConnection;
	
	public DatabaseService(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}
	
	public void performTask() {
		databaseConnection.connect();
		System.out.println("This is from database service");
	}
}

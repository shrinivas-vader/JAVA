package LooseCouple;

public class Service {

	Database database;
		
	public Service(Database database) {
		this.database = database;
	}
	
	public void performTask() {
		database.connect();
		System.out.println("Performing the task from Service class...");
	}
}

package databaseLooselyCoupledPackage;

public class MysqlDb implements DatabaseConnection{

	@Override
	public void openConnection() {
		// TODO Auto-generated method stub
		System.out.println("This is opening the mysql db connection");
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("This is connecting to mysql db");
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("This is getting data from mysql db");
	}

}

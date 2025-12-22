package LooseCouple;

public class MysqlDatabase implements Database{
	
	@Override
	public void connect() {
		System.out.println("Connecting to MySQL");
	}

}

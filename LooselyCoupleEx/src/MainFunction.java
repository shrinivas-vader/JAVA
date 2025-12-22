import LooseCouple.*;

class MainFunction{
	
	public static void main(String[] args) {
		
		Database mysql = new MysqlDatabase();
		Service mysqlConnect = new Service(mysql);
		mysqlConnect.performTask();
		
		System.out.println();
		
		Database oracle = new OracleDatabase();
		Service oracleConnect = new Service(oracle);
		oracleConnect.performTask();

		
	}
}
package looselyCoupledPackage;

import animalLooselyCoupledPackage.Animal;
import animalLooselyCoupledPackage.Cat;
import animalLooselyCoupledPackage.Dog;
import companyLoosleyCoupledPackage.BusinessService;
import companyLoosleyCoupledPackage.Businesses;
import companyLoosleyCoupledPackage.TataCompany;
import companyLoosleyCoupledPackage.VolkswagonCompany;
import databaseLooselyCoupledPackage.DatabaseConnection;
import databaseLooselyCoupledPackage.DatabaseService;
import databaseLooselyCoupledPackage.MysqlDb;
import databaseLooselyCoupledPackage.OracleDb;

public class LooselyCoupledMainClass {

	public static void main(String[] args) {

//		Animal animal = new Dog();
//		animal.Eat();
//		
//		Animal animal = new Cat();
//		animal.Eat();
		
//====================================================================================
//		DatabaseConnection databaseConnection = new OracleDb();
//		DatabaseService databaseService = new DatabaseService(databaseConnection);
//		databaseService.performTask();
		
//		DatabaseConnection dbConnection = new MysqlDb();
//		DatabaseService dbService = new DatabaseService(dbConnection);
//		dbService.performTask();
//====================================================================================

		Businesses businesses = new TataCompany();
//		Businesses businesses = new VolkswagonCompany();

		BusinessService runBusiness = new BusinessService(businesses);
		runBusiness.runBusinessOperations();
		
	}

}

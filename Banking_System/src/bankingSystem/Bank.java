package bankingSystem;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BankAccount ba = new BankAccount("shrinivas", 0.00);
		BankAccount ba1 = new BankAccount("shri", 0.00);
		BankAccount b=ba;
		
		int option = 0;
		while(option!=5) {
			System.out.println("Choose option\n1.deposite\n2.withdraw\n3.Check balance\n4.Change User\n5.Exit\n");
			option = sc.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("enter amount to be deposite\n");
				Double depositAmount = sc.nextDouble();
				b.deposite(depositAmount);
				break;
				
			case 2:
				System.out.println("enter amount to be withdraw\n");
				Double withdrawAmount = sc.nextDouble();
				b.withdraw(withdrawAmount);
				break;
				
			case 3:
				b.checkBalance();
				break;
				
			case 4:
				if(b==ba) {
					b=ba1;
				}
				else {
					b=ba;
				}
				System.out.println("User changed to "+b.accountHolder+"\n");
				
				break;
				
			case 5:
				System.out.println("Thank you "+b.accountHolder+"\n");;
				break;
				
			default:
				System.out.println("Choose correct option\n");
				break;
			}
		}
		
		
		
		
		
		
	}

}

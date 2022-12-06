package program;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class ProgBankAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount bankAccount;
		
		System.out.print("Enter a account number: ");
		int account = sc.nextInt();
		System.out.print("Enter a account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char questionDeposit = sc.next().charAt(0); 
		if (questionDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankAccount = new BankAccount(account, name, initialDeposit);
		} else {
			bankAccount = new BankAccount(account, name);
		}
		System.out.println();
		
		System.out.println("Account data: ");
		System.out.print(bankAccount);
		System.out.println();
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		bankAccount.deposit(amount);
		System.out.println("Updated account data: ");
		System.out.print(bankAccount);
		System.out.println();
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		bankAccount.withdraw(amount);
		System.out.println("Updated account data: ");
		System.out.print(bankAccount);
		System.out.println();
		
		
		sc.close();
	}

}

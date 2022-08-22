package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de uma conta bancária e depois realizar
		 * um saque nesta conta bancária, mostrando o novo saldo. Um saque não pode
		 * ocorrer ou se não houver saldo na conta, ou se o valor do saque for superior
		 * ao limite de saque da conta.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Input data
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		// Processing
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		// Input withdraw
		System.out.print("\nEnter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		// Output
		
		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f\n", acc.getBalance());
		}
		catch (BusinessException e){
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}

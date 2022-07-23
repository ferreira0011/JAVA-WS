package application;

import java.util.Locale;
import java.util.Scanner;
import entities.employee;

public class main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em 
		 * seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o 
		 * sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto � 
		 * afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. Use a classe projetada abaixo.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee emp = new employee();
		
		//Data input.
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		//Data output.
		System.out.println("\nEmployee: " + emp);
		
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("\nUpdate data: " + emp);
		sc.close();
	}

}

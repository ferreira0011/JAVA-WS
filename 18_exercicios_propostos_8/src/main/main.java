package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um n�mero inteiro 
		 * e dizer se este n�mero � par ou �mpar.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um n�mero: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}

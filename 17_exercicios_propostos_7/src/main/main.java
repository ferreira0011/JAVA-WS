package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um n�mero inteiro, 
		 * e depois dizer se este n�mero � negativo ou n�o
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um n�mero: ");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("N�O NEGATIVO");
		}
		
		sc.close();

	}

}

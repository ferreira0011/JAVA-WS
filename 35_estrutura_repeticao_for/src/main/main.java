package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que lê um valor inteiro N e depois N números inteiros
		 * Ao final, mostra a soma dos N números lidos.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a quantidade de números a serem lidos: ");
		int n = sc.nextInt();
		int soma = 0;
		
		System.out.println("\nDigite os números:");
		
		for (int i = 0 ; i < n; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println("\nSoma dos números: " + soma);
		sc.close();

	}

}

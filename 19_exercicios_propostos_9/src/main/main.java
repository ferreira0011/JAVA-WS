package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
		 * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
		 * ordem crescente ou decrescente.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o valor A: ");
		int a = sc.nextInt();
		
		System.out.printf("Digite o valor B: ");
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("\nSão Múltiplos");
		} else {
			System.out.println("\nNão São Múltiplos");
		}
		
		
		sc.close();

	}

}

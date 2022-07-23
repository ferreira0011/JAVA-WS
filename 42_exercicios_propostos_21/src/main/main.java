package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
		 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a quantidade de pares: ");
		int nQtd = sc.nextInt();
		
		System.out.println("\nDigite os pares");
		
		double valor1, valor2, divisao = 0;
		
		for(int i=0; i<nQtd; i++) {
			System.out.printf("\nValor 1: ");
			valor1 = sc.nextDouble();
			System.out.printf("Valor 2: ");
			valor2 = sc.nextDouble();
			
			if(valor2 == 0) {
				System.out.println("\nDivisão Impossível");
			} else {
				divisao = valor1 / valor2;
				System.out.printf("\n%.2f\n", divisao);
			}
		}
		sc.close();
	}
}
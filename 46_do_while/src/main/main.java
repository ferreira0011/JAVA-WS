package main;

import java.awt.image.RescaleOp;
import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
		 * Perguntar se o usu�rio deseja repetir (s/n). Caso o usu�rio digite "s", repetir o programa.
		 * F�rmula: F = 9C / 5 + 32
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resposta;
		
		do {
		//Entrada de dados.
		System.out.print("\nDigite a temperatura em Celsius: ");
		double C = sc.nextDouble();// C == Graus Celsius.
		
		//Processamento.
		double F = 9.0 * C / 5.0 + 32.0;// F == Graus fahrenheit.
		
		//Sa�da de dados.
		System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
		
		//Repeti��o do algoritmo.
		System.out.print("Deseja repetir (s/n)? ");
		resposta = sc.next().charAt(0);
			
		} while(resposta != 'n');
		
		sc.close();
	}

}

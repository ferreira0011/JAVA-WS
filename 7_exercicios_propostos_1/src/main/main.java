package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		/*Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma 
		mensagem explicativa, conforme exemplos.
		*/
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Valor 1: ");
		double valor1 = sc.nextDouble();
		
		System.out.printf("Valor 2: ");
		double valor2 = sc.nextDouble();
		
		double soma = valor1 + valor2;
		System.out.printf("SOMA = %.2f", soma);
		
		sc.close();

	}

}

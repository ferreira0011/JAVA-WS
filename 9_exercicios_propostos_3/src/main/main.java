package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
		 de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.printf("Valor A: ");
		a = sc.nextInt();
		System.out.printf("Valor B: ");
		b = sc.nextInt();
		System.out.printf("Valor C: ");
		c = sc.nextInt();
		System.out.printf("Valor D: ");
		d = sc.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.println("\nDIFERENÇA = " + diferenca);
		
		sc.close();
	}

}

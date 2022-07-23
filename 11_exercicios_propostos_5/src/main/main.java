package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
		 código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, qtd1, cod2, qtd2;
		double preco1, preco2, total;
		
		System.out.printf("Código 1: ");
		cod1 = sc.nextInt();
		System.out.printf("Quantidades 1: ");
		qtd1 = sc.nextInt();
		System.out.printf("Preço 1: ");
		preco1 = sc.nextDouble();
		
		System.out.printf("\nCódigo 2: ");
		cod2 = sc.nextInt();
		System.out.printf("Quantidades 2: ");
		qtd2 = sc.nextInt();
		System.out.printf("Preço 2: ");
		preco2 = sc.nextDouble();
		
		total = qtd1 * preco1 + qtd2 * preco2;
		
		System.out.printf("\nVALOR A PAGAR: R$ %.2f", total);
		
		sc.close();
		
	}

}

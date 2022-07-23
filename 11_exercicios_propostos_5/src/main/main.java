package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o 
		 c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, qtd1, cod2, qtd2;
		double preco1, preco2, total;
		
		System.out.printf("C�digo 1: ");
		cod1 = sc.nextInt();
		System.out.printf("Quantidades 1: ");
		qtd1 = sc.nextInt();
		System.out.printf("Pre�o 1: ");
		preco1 = sc.nextDouble();
		
		System.out.printf("\nC�digo 2: ");
		cod2 = sc.nextInt();
		System.out.printf("Quantidades 2: ");
		qtd2 = sc.nextInt();
		System.out.printf("Pre�o 2: ");
		preco2 = sc.nextDouble();
		
		total = qtd1 * preco1 + qtd2 * preco2;
		
		System.out.printf("\nVALOR A PAGAR: R$ %.2f", total);
		
		sc.close();
		
	}

}

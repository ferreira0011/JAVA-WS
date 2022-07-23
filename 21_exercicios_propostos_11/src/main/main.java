package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
		 * seguir, calcule e mostre o valor da conta a pagar
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double total = 0;
		
		System.out.printf("Digite o código do item: ");
		codigo = sc.nextInt();
		
		System.out.printf("Digite a quantidade do item: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 4.0;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade * 5.0;
		} else if (codigo == 4) {
			total = quantidade * 2.0;
		} else if (codigo == 5) {
			total = quantidade * 1.50;
		}
		
		System.out.printf("\nTOTAL: R$ %.2f", total);
		
		sc.close();

	}

}

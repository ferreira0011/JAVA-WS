package application;

import java.util.Locale;
import java.util.Scanner;
import util.currencyConverter;


public class main {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por 
		 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda 
		 * que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
		 * para ser responsável pelos cálculos.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		currencyConverter cc = new currencyConverter();
		
		System.out.print("What is the dollar price? ");
		cc.price = sc.nextDouble();
		
		System.out.print("\nHow many dollars will be bought? ");
		cc.quantity = sc.nextDouble();
		
		System.out.printf("\nAmount to be paid in reais = %.2f", cc.converter());
		
		sc.close();
	}

}

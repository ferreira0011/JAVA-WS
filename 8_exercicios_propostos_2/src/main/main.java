package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 Faça um programa para ler o valor do raio de um círculo, e depois mostrar 
		 o valor da área deste círculo com quatro casas decimais conforme exemplos.
		 Fórmula da área: area = π . raio2
		 Considere o valor de π = 3.14159
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("__Cálculo Área__\n");
		
		System.out.printf("Valor do raio: ");
		double raio = sc.nextDouble();
		
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("\nÁrea: %.4f", area);
		
		sc.close();

	}

}

package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
		 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
		 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
		 * peso 5.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Variáveis.
		int nqtd=0, xValores=0, i=0;
		double a=0.0, pA=2.0, b=0.0, pB=3.0, c=0.0, pC=5.0, somaP=0.0, media=0.0; 
				
		System.out.printf("Digite a quantidade de valores a serem lidos: ");
		nqtd = sc.nextInt(); //Quantidade de valores a serem lidos.
		
		for(i=0; i<nqtd; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			somaP = (pA + pB + pC);
			media = (a*pA + b*pB + c*pC) / somaP;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();

	}

}

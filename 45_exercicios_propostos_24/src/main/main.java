package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
		 * começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nValor=0, linhas=1, quadrado=1, cubo=1;
		
		System.out.printf("Digite um número inteiro positivo: ");
		nValor = sc.nextInt();
		
		System.out.printf("Linhas		Quadrado	Cubo\n");
		
		for(linhas=1; linhas <= nValor; linhas++) {
			quadrado = (int) Math.pow (linhas,2);
			cubo =  (int) Math.pow (linhas,3);
			System.out.printf("%d		%d		%d", linhas, quadrado, cubo);
			System.out.println();
		}
		
		sc.close();
	}

}

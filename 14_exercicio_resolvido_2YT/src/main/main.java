package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Programa para ler 2 notas, calcular a média e mostrar 
		 * "reprovado" se a nota for < 60.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double notaFinal = nota1 + nota2;
		
		System.out.printf("NOTA FINAL = %.1f\n", notaFinal);
		if (notaFinal < 60.0) {
			System.out.println("REPROVADO");
		}
		sc.close();
	}

}

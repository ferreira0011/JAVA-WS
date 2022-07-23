package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n__Cálculo de Terreno__\n");
		
		System.out.printf("Largura: ");
		double largura = sc.nextDouble();
		
		System.out.printf("Comprimento: ");
		double comprimento = sc.nextDouble();
		
		System.out.printf("Valor m²: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA m² = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		
		sc.close();
		
	}

}

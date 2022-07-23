package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Cálculo de Delta e Bhaskara
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Delta e Bhaskara\n");
		
		System.out.printf("Valor A: ");
		double a = sc.nextDouble();
		System.out.printf("Valor B: ");
		double b = sc.nextDouble();
		System.out.printf("Valor C: ");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4.0 * a * c;
		
		if (a == 0 || delta < 0.0) {
			System.out.println("\nImpossível calcular");
		}
		else {
			double x1 = (- b + Math.sqrt(delta)) / (2.0 * a);
			double x2 = (- b - Math.sqrt(delta)) / (2.0 * a);
			
			System.out.printf("\nDelta = %.5f", delta);
			System.out.printf("\nX1 = %.5f\n", x1);
			System.out.printf("X2 = %.5f\n", x2);
		}
		
		
		
		sc.close();
	}

}

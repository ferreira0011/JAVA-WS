package application;

import java.util.Locale;
import java.util.Scanner;
import entities.rectangle;

public class main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os valores da largura e altura 
		 * de um retângulo. Em seguida, mostrar na tela o valor de 
		 * sua área, perímetro e diagonal. Usar uma classe como 
		 * mostrado no projeto ao lado.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n	Enter rectangle width and height");
		
		rectangle rectangle = new rectangle();
		
		//Data input.
		System.out.print("\nEnter rectangle width: ");
		rectangle.width = sc.nextDouble();
		
		System.out.print("Enter rectangle height: ");
		rectangle.height = sc.nextDouble();
		
		//Data output.
		System.out.printf("\nAREA = %.2f", rectangle.area());
		System.out.printf("\nPERIMETER = %.2f", rectangle.perimeter());
		System.out.printf("\nDIAGONAL = %.2f", rectangle.diagonal());
		
		sc.close();
		
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;
import util.calculator;

public class program {
	
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um valor numérico qualquer, e daí mostrar 
		 * quanto seria o valor de uma circunferência e do volume de uma esfera 
		 * para um raio daquele valor. Informar também o valor de PI com duas casas decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		calculator calc = new calculator();
		
		//Raio.
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		//Circunferência.
		double c = calc.circumference(radius);
		
		//Volume
		double v = calc.volume(radius);
		
		//Saída.
		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", calc.PI);
		
		sc.close();
	}

}

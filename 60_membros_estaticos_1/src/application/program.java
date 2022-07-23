package application;

import java.util.Locale;
import java.util.Scanner;
import util.calculator;

public class program {
	
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um valor num�rico qualquer, e da� mostrar 
		 * quanto seria o valor de uma circunfer�ncia e do volume de uma esfera 
		 * para um raio daquele valor. Informar tamb�m o valor de PI com duas casas decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		calculator calc = new calculator();
		
		//Raio.
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		//Circunfer�ncia.
		double c = calc.circumference(radius);
		
		//Volume
		double v = calc.volume(radius);
		
		//Sa�da.
		System.out.printf("Circumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", calc.PI);
		
		sc.close();
	}

}

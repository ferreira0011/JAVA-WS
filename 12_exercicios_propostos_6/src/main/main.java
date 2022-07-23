package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 Fazer um programa que leia três valores com ponto flutuante 
		 de dupla precisão: A, B e C. Em seguida, calcule e mostre: 
		 a) a área do triângulo retângulo que tem A por base e C por altura. 
		 b) a área do círculo de raio C. (pi = 3.14159) 
		 c) a área do trapézio que tem A e B por bases e C por altura. 
		 d) a área do quadrado que tem lado B. 
		 e) a área do retângulo que tem lados A e B.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.printf("Valor A: ");
		a = sc.nextDouble();
		System.out.printf("Valor B: ");
		b = sc.nextDouble();
		System.out.printf("Valor C: ");
		c = sc.nextDouble();
		
		//Triângulo
		triangulo = (a * c) / 2;
		//Circulo
		circulo = 3.14159 * Math.pow(c, 2);
		//Trapezio
		trapezio = ((a + b) * c) / 2;
		//Quadrado
		quadrado = Math.pow(b, 2);
		//Retangulo
		retangulo = a * b;
		
		System.out.printf("\nTRIÂNGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETÂNGULO: %.3f\n", retangulo);
		
		sc.close();

	}

}

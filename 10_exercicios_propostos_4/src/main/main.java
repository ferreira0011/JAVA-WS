package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	/*
	 Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
	 hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
	 decimais.
	 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero_funcionario;
		double horas_trabalhadas, valor_hora, salario;
		
		System.out.printf("Número do funcionário: ");
		numero_funcionario = sc.nextInt();
		System.out.printf("Horas trabalhadas: ");
		horas_trabalhadas = sc.nextDouble();
		System.out.printf("Valor da hora: ");
		valor_hora = sc.nextDouble();
		
		salario = horas_trabalhadas * valor_hora;
		
		System.out.println("\nNÚMERO DO FUNCIONÁRIO: " + numero_funcionario);
		System.out.printf("SALÁRIO: R$ %.2f", salario);
		
		sc.close();
	}

}

package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	/*
	 Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por 
	 hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas 
	 decimais.
	 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero_funcionario;
		double horas_trabalhadas, valor_hora, salario;
		
		System.out.printf("N�mero do funcion�rio: ");
		numero_funcionario = sc.nextInt();
		System.out.printf("Horas trabalhadas: ");
		horas_trabalhadas = sc.nextDouble();
		System.out.printf("Valor da hora: ");
		valor_hora = sc.nextDouble();
		
		salario = horas_trabalhadas * valor_hora;
		
		System.out.println("\nN�MERO DO FUNCION�RIO: " + numero_funcionario);
		System.out.printf("SAL�RIO: R$ %.2f", salario);
		
		sc.close();
	}

}

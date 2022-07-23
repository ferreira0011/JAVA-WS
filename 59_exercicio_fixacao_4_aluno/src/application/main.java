package application;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano 
		 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
		 * ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam 
		 * para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para 
		 * resolver este problema.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		student stud = new student();
		
		System.out.print("Nome do aluno: ");
		stud.nome = sc.nextLine();
		System.out.println("\nDigite as notas dos tr�s trimestes: ");
		stud.nota1 = sc.nextDouble();
		stud.nota2 = sc.nextDouble();
		stud.nota3 = sc.nextDouble();
				
		System.out.printf("\nFINAL GRADE = %.2f\n", stud.somaNotas());
		
		if (stud.somaNotas() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS\n", stud.notaRestante());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}

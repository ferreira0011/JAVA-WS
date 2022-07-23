package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
		 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int duracao;
		
		System.out.printf("Digite a hora inicial do jogo: ");
		int horaInicial = sc.nextInt();
		
		System.out.printf("Digite a hora final do jogo: ");
		int horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("\nO JOGO DUROU %d HORA(S)", duracao);
		
		sc.close();
		
	}

}

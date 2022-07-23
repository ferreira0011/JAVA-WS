package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		 * Lembrando que, por definição, fatorial de 0 é 1.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int fatorial = 1;
		
		System.out.printf("Digite um valor: ");
		int Nvalor = sc.nextInt();
		
			for(int i=1; i<=Nvalor; i++) {
				fatorial = fatorial * i;
			}
		
		System.out.println(fatorial);
		
		sc.close();
	}

}

package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Ler um número inteiro N e calcular todos os seus divisores.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um número: ");
		int num = sc.nextInt();
		
		for(int i=1; i<= num; i++) {
			if(num % i == 0) {
				System.out.printf("%d\n", i);
			}
		}
		sc.close();
	}

}

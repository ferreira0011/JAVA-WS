package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * https://www.youtube.com/watch?v=JTa8WEhV38E
		 * Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N: 1 x N = N 2 x N = 2N ... 10 x N = 10N
		 * Entrada
		 * A entrada contém um valor inteiro N (2 < N < 1000).
		 * Saída
		 * Imprima a tabuada de N, conforme o exemplo fornecido.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			int produto = i * n;
			System.out.println(i + " x " + n + " = " + produto);
		}
		
		sc.close();
	}

}

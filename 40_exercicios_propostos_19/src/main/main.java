package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
		 * Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando 
		 * essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Vari�veis.
		int nqtd=0, xValores=0, i=0, in=0, out=0; 
		
		System.out.printf("Digite a quantidade de valores a serem lidos: ");
		nqtd = sc.nextInt(); //Quantidade de valores a serem lidos.
		
		for(i=0; i < nqtd; i++) {
			xValores = sc.nextInt();
			if(xValores < 10 || xValores > 20) {
				out += 1;
			} 
			else {
				in += 1;
			}
		}
		
		System.out.println(in + " in" + "\n" + out + " out" + "\n");
		
		sc.close();
	}

}

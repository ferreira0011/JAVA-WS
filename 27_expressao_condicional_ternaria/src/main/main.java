package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		//Exemplo de expressao condicional tern�ria.
		
		//M�todo padr�o com if else
		/*
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
		desconto = preco * 0.1;
		}
		else {
		desconto = preco * 0.05;
		}
		
		System.out.println(desconto);
		*/
		
		//M�todo tern�ria
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
		
		sc.close();

	}

}

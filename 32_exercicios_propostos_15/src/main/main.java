package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
		 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
		 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a senha: ");
		int senha = sc.nextInt();
		
		int senhaCorreta = 2002;
		
		while (senha != senhaCorreta) {
			System.out.println("Senha Inválida\n");
			System.out.printf("Digite a senha: ");
			senha = sc.nextInt();
		} 
		
		System.out.println("\nAcesso Permitido");
		
		sc.close();

	}

}

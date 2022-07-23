package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/*
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		
		int x;
		x = sc.nextInt();
		System.out.println("Voce digitou: " + x);
		
		
		double x;
		x = sc.nextDouble();
		System.out.printf("Voce digitou: %.2f\n", x);
		
		
		//Leu apenas 1 dado
		 
		char x;
		x = sc.next().charAt(0);
		System.out.println("Voce digitou: " + x);
		
		
		//Ler mais dados
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:\n");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		//Ler até a quebra de linha
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		*/
		
		//Quebra de linha pendente
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}

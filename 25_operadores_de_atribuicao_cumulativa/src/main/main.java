package main;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a quantidade de minutos: ");
		int minutos = sc.nextInt();
		double conta;
		conta = 50.0;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f\n", conta);
		
		
		sc.close();

	}

	private static double conta(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		/*
		 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usu�rio).
		 * Ao final, mostrar a etiqueta de pre�o de cada produto na mesma ordem em que
		 * foram digitados. Todo produto possui nome e pre�o. Produtos importados
		 * possuem uma taxa de alf�ndega, e produtos usados possuem data de fabrica��o.
		 * Estes dados espec�ficos devem ser acrescentados na etiqueta de pre�o conforme
		 * exemplo (pr�xima p�gina). Para produtos importados, a taxa e alf�ndega deve
		 * ser acrescentada ao pre�o final do produto.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");

			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			} else if (ch == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			} else if (ch == 'c') {
				list.add(new Product(name, price));
			}
		}

		System.out.println("\nPRICE TAGS:");

		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();
	}
}

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		/*
		 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois,
		 * mostrar um sumário do pedido conforme exemplo (próxima página). Nota: o
		 * instante do pedido deve ser o instante do sistema: new Date()
		 * 
		 */

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		// Instance Order
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			// Instance product
			Product product = new Product(productName, productPrice);
			
			// Instance OrderItem
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			// AddItem Order
			order.addItem(it);
		}
		
		System.out.println();
		System.out.println(order);

		sc.close();
	}

}

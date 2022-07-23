package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// Declaração e Instanciar lista.
		List<String> list = new ArrayList<>();

		// Inserir na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");

		// Ver tamanho da lista
		System.out.println(list.size());

		// Imprimir lista
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------");

		// Remover elemento da lista
		// list.remove("Anna");
		// list.remove(1);

		// Remover por predicado.
		list.removeIf(x -> x.charAt(0) == 'M');

		// Imprimir lista
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------");

		// Encontrar posição de um elemento.
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("---------------");

		// Deixar na lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		// Imprimir lista
		for (String x : result) {
			System.out.println(x);
		}
		// Encontrar um elemento da lista com base em um certo predicado.
		System.out.println("---------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		
		System.out.println(name);
		
		
	}

}

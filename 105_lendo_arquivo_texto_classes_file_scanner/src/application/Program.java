package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File(
				"D:\\ARQUIVOS\\VICTOR_NEW\\PROGRAMAÇÃO\\JAVA\\Udemy - Curso Java - Dr. Nelio Alves\\WS-ECLIPSE-JAVA\\105_lendo_arquivo_texto_classes_file_scanner\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}

		}
	}

}

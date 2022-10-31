package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "D:\\ARQUIVOS\\VICTOR_NEW\\PROGRAMAÇÃO\\JAVA\\Udemy - Curso Java - Dr. Nelio Alves\\WS-ECLIPSE-JAVA\\107_bloco_try_with_resources\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}

package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Goot night" };

		String path = "D:\\ARQUIVOS\\VICTOR_NEW\\PROGRAMAÇÃO\\JAVA\\Udemy - Curso Java - Dr. Nelio Alves\\WS-ECLIPSE-JAVA\\108_file_writer_e_buffered_writer\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

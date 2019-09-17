import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

import java.io.File;
import java.io.PrintWriter;

public class ManipuladorArquivo{
	
	public static void main(String[] args) throws IOException{
		
		// Cria/abre um arquivo de nome Valter.txt
		Path file = Paths.get("Valter.txt");
		
		// Escreve uma String "Primeira linha" no arquivo
		Files.write(file, "Primeira Linha \n".getBytes());
		
		// Escreve uma String "Segunda linha" no arquivo
		Files.write(file, "Segunda Linha".getBytes(),StandardOpenOption.APPEND);
		
		// Apagar o arquivo
		Files.delete(file);
		
		// Cia um arquivo de nome Turma.txt
		PrintWriter writer = new PrintWriter(new File("Turma.txt"));
		writer.println("Primeira linha");
		writer.println("Segunda linha");
		
		// Escrever numero de 0 a 100 no arquivo numeros.txt
		for(int i = 0; i <= 100; i++){
			PrintWriter num = new PrintWriter(new File("numeros.txt"));
			String.valueof(i);
			num.println(i);
			
		}

		
		writer.close();
		
	}
}

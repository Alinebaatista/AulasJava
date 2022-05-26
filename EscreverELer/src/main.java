import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
	
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		
		System.out.println("Digite um Texto");
		scanner.nextLine();
		
					//Escrever
		
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("leer.txt"))) {
			escrever.write(string);
		}
		
					//Ler
		try(BufferedReader reader = new BufferedReader(new FileReader("leer.txt"))){
			String line;
			String string1 = " ";
			
			while((line = reader.readLine())!= null) {
				string1  += line + "/n";
			}

		System.out.println(string1);
			
		}
			
		
	}

}

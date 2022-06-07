
//Buffered

//importação 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {

		String s = "Texto para ser gravado no arquivo";

		Mouse mouse1 = new Mouse(false, 2, "Pequeno");
		Mouse mouse2 = new Mouse(true, 2, "Médio");
		Mouse mouse3 = new Mouse(false, 2, "Pequeno");

		List <Mouse> listaDeMouse = new ArrayList<>();

		listaDeMouse.add(mouse1);
		listaDeMouse.add(mouse2);
		listaDeMouse.add(mouse3);

						// escereve no arquivo
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
			for (Mouse mouse : listaDeMouse)
				escrever.write(mouse.toString());
		}

	}

	
}

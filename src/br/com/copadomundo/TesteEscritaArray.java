package br.com.copadomundo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TesteEscritaArray {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<String>nomes = new ArrayList<>();
		
		nomes.add("João");
		nomes.add("Felipe");
		nomes.add("Fernando");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testeNomes.csv"));
		oos.writeObject(nomes);
	}

}

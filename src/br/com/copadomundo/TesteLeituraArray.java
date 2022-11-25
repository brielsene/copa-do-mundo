package br.com.copadomundo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class TesteLeituraArray {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testeNomes.csv"));
		List<String>listaNomes = (List<String>) ois.readObject();
		
		System.out.println(listaNomes);
	}

}

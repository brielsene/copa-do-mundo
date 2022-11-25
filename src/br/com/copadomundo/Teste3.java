package br.com.copadomundo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Teste3 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("1jogo.csv"));
//		Jogos jogo1 = (Jogos) ois.readObject();
//		
//		System.out.println(jogo1);
		List<Jogos>jogos = (List<Jogos>)ois.readObject();
		
		System.out.println(jogos);

	}

}

package br.com.copadomundo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class TesteLeitura {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("jogo1.csv"));
		
		List<Jogos>jogos = (List<Jogos>) ois.readObject();
		
		jogos.forEach(exibirJogos ->{
			System.out.println(exibirJogos);
		});

	}

}

package br.com.copadomundo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Teste2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Jogos>jogos = new ArrayList<>();
		Jogos jogo1 = new Jogos("Qatar 957 Stadium", 16);
		jogo1.adicionaTime(new Time("Brasil"), new Time("Servia"));
		jogos.add(jogo1);
		System.out.println(jogos);
		
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("1jogo.csv"));
		oos.writeObject(jogos);
//		System.out.println(jogo1);
//		

	}

}

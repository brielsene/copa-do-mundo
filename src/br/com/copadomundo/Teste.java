package br.com.copadomundo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Jogos>jogos = new ArrayList<>();
		Time time1 = new Time("Brasil");
		Time time2 = new Time("Sérvia");
		Jogos jogo1 = new Jogos("Qatar Stadium 957", 16);
//		jogos.add(jogo1);
		jogo1.adicionaTime(time1, time2);
		jogos.add(jogo1);
		

		//Jogo2
//		
		System.out.println();
//		
//		
		Time time3 = new Time("Portugal");
		Time time4 = new Time("Gana");
		Jogos jogo2 = new Jogos("Indefinido", 13);
		jogo2.adicionaTime(time3, time4);
//		System.out.println(jogo2);
		jogos.add(jogo2);
		
		
		

		
		System.out.println(jogos);
		
		System.out.println();
		
		jogos.forEach(exibirJogos ->{
			System.out.println(exibirJogos);
		});
		
		System.out.println();
//		System.out.println(jogos);
		//Ordenado por local
//		Collections.sort(jogos);
		System.out.println(jogos);
		
	
		
		
		
		
		
	
		
		
		
		

	}

}

package br.com.copadomundo;

import java.util.ArrayList;
import java.util.List;

public class TesteMap {

	public static void main(String[] args) {
		CopaDoMundo copa = new CopaDoMundo();
		List<Jogos>jogos = new ArrayList<>();
		Time time1 = new Time("Brasil");
		Time time2 = new Time("Sérvia");
		Jogos jogo1 = new Jogos("Qatar Stadium 957", 16);
//		jogos.add(jogo1);
		jogo1.adicionaTime(time1, time2);
		jogos.add(jogo1);
		copa.adicionaJogos(jogo1);
		
		System.out.println("Qual é o primeiro jogo?");
		copa.buscaJogoPorNumero(1);
		Jogos jogoss = copa.buscaJogoPorNumero(1);
		System.out.println(jogoss);
		
		
		

	}

}

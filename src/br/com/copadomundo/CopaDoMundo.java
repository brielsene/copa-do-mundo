package br.com.copadomundo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class CopaDoMundo {
	private List<Jogos>jogos = new ArrayList<>();
	private Map<Integer, Jogos>anotaJogos = new HashMap<>(); 
	
	public void adicionaJogos(Jogos jogo) {
		jogos.add(jogo);
		this.anotaJogos.put(jogo.getNumeroJogo(), jogo);
		
		
	}
	
	public Jogos buscaJogoPorNumero(int numero) {
		if(!anotaJogos.containsKey(numero)) {
			throw new NoSuchElementException("Esse jogo ainda não existe, N: "+numero);
		}
		return anotaJogos.get(numero);
	}
	
	public List<Jogos> getJogos() {
		return jogos;
	}
	
			
	

}

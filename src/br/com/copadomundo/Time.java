package br.com.copadomundo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Time implements Serializable{
	private String nome;
	private Set<Jogador>jogadores = new HashSet<>();
	
	public Time(String nome) {
		this.nome = nome;
		
	}
	
	public Set<Jogador> getJogadores() {
		return jogadores;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Time: "+this.nome;
	}

}

package br.com.copadomundo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Jogos implements Serializable, Comparable<Jogos> {
	private String local;
	private int horario;
	private static int contador = 0;
	private int numeroJogo =0;
//	Time[]times = new Time[2];
	List<Time>times = new ArrayList<>();
	
	public Jogos (String local, int horario) {
		this.horario = horario;
		this.local = local;
	
		contador+=1;
		numeroJogo = contador;
		
	}
	
	public int getHorario() {
		return horario;
	}
	
	public String getLocal() {
		return local;
	}
	
	public List<Time> getTimes() {
		return times;
	}
	
	public void adicionaTime(Time t1, Time t2) {
		times.add(t1);
		times.add(t2);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Jogo: "+this.numeroJogo+" Local: "+this.local+" Horario: "+this.horario+" , Times: "+times;
	}

	@Override
	public int compareTo(Jogos o) {
		// TODO Auto-generated method stub
		return local.compareTo(o.local);
		
		//Se quiser ordenar por alguma int é:
		//return Integer.compare(x,y);
	}



	
	
	
	
	
	
	

}

package model;

import java.util.ArrayList;
import java.util.List;

public class Participantes {

	List<Participantes> listaParticipantes = new ArrayList<Participantes>();
	
	public Participantes() {}
	
	public void setParticipantes(Participantes p) {
		this.listaParticipantes.add(p);
	}
	
	public List<Participantes> getParticipantes(){
		return listaParticipantes;
	}

	@Override
	public String toString() {
		return "Participantes [listaParticipantes=" + listaParticipantes + "]";
	}
	
}

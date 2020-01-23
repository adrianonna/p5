package model;

import java.util.List;

public abstract class AmbienteDecorator extends Ambiente{
	Ambiente ambiente;
	
    public AmbienteDecorator(Ambiente umAmbiente) {
    	ambiente = umAmbiente;
    }
    
    public String getNome() {
    	return ambiente.getNome()+" + "+nome;
    }
    
    public String getDescricao() {
    	return ambiente.getDescricao()+" + "+descricao;
    }
    
    public List<Dispositivo> getDispositivos() {
    	return ambiente.getDispositivos();
    }
    
    
}
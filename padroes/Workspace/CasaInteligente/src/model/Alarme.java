package model;

public class Alarme extends AmbienteDecorator implements Dispositivo{
	Boolean ativo;
	
	public Alarme(Ambiente umAmbiente, Boolean status) {
        super(umAmbiente);
        nome = "Alarme";
        ativo = status;
        descricao = "Alarme geral";
    }

	@Override
	public void ativar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desativar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean estaAtivado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Alarme: status=" + ativo;
	}	
}

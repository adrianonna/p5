package model;

public class Luz extends AmbienteDecorator implements Dispositivo{
	Boolean ativo;
	
	public Luz(Ambiente umAmbiente, Boolean status) {
        super(umAmbiente);
        nome = "Luz";
        ativo = status;
        descricao = "Luz de led";
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
		return "Luz: status=" + ativo;
	}	
}

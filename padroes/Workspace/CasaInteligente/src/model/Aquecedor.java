package model;

public class Aquecedor extends AmbienteDecorator implements Dispositivo{
	Boolean ativo;
	
	public Aquecedor(Ambiente umAmbiente, Boolean status) {
        super(umAmbiente);
        nome = "Aquecedor";
        ativo = status;
        descricao = "Aquecedor geral";
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
		return "Aquecedor: status=" + ativo;
	}
}

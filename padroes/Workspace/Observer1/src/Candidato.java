
public class Candidato implements Observer{

	private String nome;
	
	public Candidato(String nome, Subject subject) {
		this.nome = nome;
		subject.addObserver(this);
	}
	
	@Override
	public void update(String texto) {
		System.out.println(this.nome+" - Uma nova vaga: "+texto);
	}

}

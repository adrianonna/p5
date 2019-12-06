
public class app {

	public static void main(String[] args) {
		
		HeadHunter head = new HeadHunter();
		head.recebeVaga("Gerente");
		Observer candidato1 = new Candidato("João", head);
		Observer candidato2 = new Candidato("Maria", head);
		head.recebeVaga("Analista");
		Observer candidato3 = new Candidato("José", head);
		head.recebeVaga("Arquiteto");
	}

}

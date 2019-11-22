
public class aplicação {

	public static void main(String[] args) {

		
		Fita f1 = new Fita("Titulo1", Tipo.infantil);
		Fita f2 = new Fita("Titulo2", Tipo.lancamento);
		Fita f3 = new Fita("Titulo3", Tipo.normal);

		Cliente c1 = new Cliente("Adriano");
		Aluguel a1 = new Aluguel(f1, 2);
		Aluguel a2 = new Aluguel(f2, 3);
		Aluguel a3 = new Aluguel(f3, 5);
		c1.adicionaAluguel(a1);
		c1.adicionaAluguel(a2);
		c1.adicionaAluguel(a3);
		
		Cliente c2 = new Cliente("Samuel");
		Aluguel a4 = new Aluguel(f1, 1);
		Aluguel a5 = new Aluguel(f2, 2);
		c2.adicionaAluguel(a4);
		c2.adicionaAluguel(a5);
		
		Cliente c3= new Cliente("Renatha");
		Aluguel a6 = new Aluguel(f1, 4);
		c3.adicionaAluguel(a6);
		
		System.out.println(c1.extrato());
		System.out.println(c2.extrato());
		System.out.println(c3.extrato());


	}

}

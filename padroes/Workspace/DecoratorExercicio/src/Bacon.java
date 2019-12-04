public class Bacon extends PizzaDecorator {
	public Bacon(Pizza pizza) {
		super(pizza);
		descricao = "Bacon";
		preco = 4;
	}
}

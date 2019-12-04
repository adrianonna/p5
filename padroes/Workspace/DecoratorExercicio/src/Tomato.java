
public class Tomato extends PizzaDecorator {
	public Tomato(Pizza pizza) {
		super(pizza);
		descricao = "Tomato";
		preco = 2;
	}
}


public class Pizzaiolo {

	public static void main(String[] args) {

        Pizza pizzaP = new Pepperoni(); 
        pizzaP = new Bacon(pizzaP);
        pizzaP = new Oregano(pizzaP);
        pizzaP = new Tomato(pizzaP);
        pizzaP = new CreamCheeseEdge(pizzaP);
        
        System.out.println(pizzaP.getDescricao() + " = R$"
                + pizzaP.getPreco());
        
	}

}

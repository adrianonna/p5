
public abstract class PizzaDecorator extends Pizza{
    Pizza pizza;
    
    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
 
    public String getDescricao() {
        return pizza.getDescricao()  + " + " + descricao;
    }
 
    public double getPreco() {
        return pizza.getPreco() + preco;
    }
}

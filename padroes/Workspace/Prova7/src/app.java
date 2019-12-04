
public class app {

	public static void main(String[] args) {
        Numero num = new NumeroUm(); 
        num = new Parenteses(num);
        num = new Colchetes(num);
        num = new Chaves(num);
        
        System.out.println(num.getNum());

	}

}

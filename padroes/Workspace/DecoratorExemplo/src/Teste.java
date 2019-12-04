
public class Teste {

	public static void main(String[] args) {	
        //Vodka + Suco + gelo + acucar
        Coquetel bebidaP = new Vodka(); 
        Coquetel add1 = new Suco(bebidaP);
        Coquetel add2 = new Gelo(add1);
        Coquetel bebidaC = new Acucar(add2);
        
        System.out.println(bebidaC.getNome() + " = R$"
                + bebidaC.getPreco());
        
        //ou
        Coquetel coquetel1 = new Vodka(); 
        coquetel1 = new Suco(coquetel1);
        coquetel1 = new Gelo(coquetel1);
        coquetel1 = new Acucar(coquetel1);
        
        System.out.println(coquetel1.getNome() + " = R$"
                + coquetel1.getPreco());
        
        //Tequila + Limão + Sal
        //Cachaça + Leite Condensado + Açúcar + Gelo
    }

}

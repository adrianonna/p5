
public class Adaptador extends Alvo{
	ClasseExistente existente = new ClasseExistente();
	
	public void operacao() {
		String texto = existente.metodoUtilDois("Opera��o Realizada.");
		existente.metodoUtilUm(texto);
		
	}

}

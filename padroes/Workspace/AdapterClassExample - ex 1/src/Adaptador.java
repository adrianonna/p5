
public class Adaptador extends ClasseExistente implements Alvo{

	public void operacao() {
		String texto = metodoUtilDois("Operação Realizada.");
		metodoUtilUm(texto);
		
	}

}

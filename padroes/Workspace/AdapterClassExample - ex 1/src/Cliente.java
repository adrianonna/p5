
public class Cliente {
	Alvo[] alvos = new Alvo[10];
	
	public void inicializaAlvos() {
		alvos[0] = new Adaptador();
		//alvos[1] = new AlvoExistente();
	}
	public void executaAlvos() {
		for(int i = 0; i < alvos.length; i++) {
				alvos[i].operacao();
				}
		}
	}


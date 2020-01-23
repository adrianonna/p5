package controller;

import model.Alarme;
import model.Ambiente;
import model.Aquecedor;
import model.Cozinha;
import model.Luz;
import model.Quarto;
import model.Sala;

public class CasaController {

	public CasaController() {}

	//MODO 1
	public Ambiente getAmbiente(String ambiente, String modo) {
		if (ambiente.equals("quarto")) {
			Quarto quarto = new Quarto();
			if (modo.equals("economia")) {
				quarto.ModoEconomia();
				return quarto;
			} else if (modo.equals("festa")) {
				quarto.modoFesta();
				return quarto;
			} else return quarto;
		}else if (ambiente.equals("sala")) {
			Sala sala = new Sala();
			if (modo.equals("festa")) {
				sala.modoFesta();
				return sala;
			} else if (modo.equals("economia")) {
				sala.modoEconomia();
				return sala;
			} else return sala;
		}else if (ambiente.equals("cozinha")) {
			Cozinha cozinha = new Cozinha();
			if (modo.equals("economia")) {
				cozinha.modoEconomia();
				return cozinha;
			} else if (modo.equals("festa")) {
				cozinha.modoFesta();
				return cozinha;
			} else return cozinha;
		}else
			return null;
	}
	
	
	//MODO 1 ALTERNATIVO
//	public Ambiente getAmbiente(String ambiente, String modo) {
//		if (ambiente.equals("quarto")) {
//			Quarto quarto = new Quarto();
//			if (modo.equals("economia")) {
//				quarto.ModoEconomia();
//				Ambiente umAmbiente = new Luz(quarto, false);
//				umAmbiente.setDescricao("Luz economia quarto desligada");
//				umAmbiente = new Aquecedor(umAmbiente, false);
//				umAmbiente.setDescricao("Aquecedor economia quarto desligado");
//				return umAmbiente;
//			} else if (modo.equals("festa")) {
//				quarto.modoFesta();
//				Ambiente umAmbiente = new Luz(quarto, true);
//				umAmbiente.setDescricao("Luz festa quarto ligada");
//				umAmbiente = new Aquecedor(umAmbiente, true);
//				umAmbiente.setDescricao("Aquecedor festa quarto ligado");
//				return umAmbiente;
//			} else {
//				Ambiente umAmbiente = new Luz(quarto, true);
//				umAmbiente.setDescricao("Luz festa quarto ligada");
//				umAmbiente = new Aquecedor(umAmbiente, false);
//				umAmbiente.setDescricao("Aquecedor familia quarto desligado");
//				return umAmbiente;
//			} 
//		}else if (ambiente.equals("sala")) {
//			Sala sala = new Sala();
//			if (modo.equals("festa")) {
//				sala.modoFesta();
//				Ambiente umAmbiente = new Luz(sala, false);
//				umAmbiente.setDescricao("Luz festa sala desligada");
//				return umAmbiente;
//			} else if (modo.equals("economia")) {
//				sala.modoEconomia();
//				Ambiente umAmbiente = new Luz(sala, false);
//				umAmbiente.setDescricao("Luz economia sala desligada");
//				return umAmbiente;
//			} else {
//				Ambiente umAmbiente = new Luz(sala, true);
//				umAmbiente.setDescricao("Luz familia sala ligada");
//				return umAmbiente;
//			}
//		}else if (ambiente.equals("cozinha")) {
//			Cozinha cozinha = new Cozinha();
//			if (modo.equals("economia")) {
//				cozinha.modoEconomia();
//				Ambiente umAmbiente = new Luz(cozinha, false);
//				umAmbiente.setDescricao("Luz economia cozinha desligada");
//				umAmbiente = new Alarme(umAmbiente, false);
//				umAmbiente.setDescricao("Alarme economia cozinha desligado");
//				return umAmbiente;
//			} else if (modo.equals("festa")) {
//				cozinha.modoFesta();
//				Ambiente umAmbiente = new Luz(cozinha, true);
//				umAmbiente.setDescricao("Luz festa cozinha ligada");
//				umAmbiente = new Alarme(umAmbiente, true);
//				umAmbiente.setDescricao("Alarme festa cozinha ligada");
//				return umAmbiente;
//			} else {
//				Ambiente umAmbiente = new Luz(cozinha, true);
//				umAmbiente.setDescricao("Luz familia cozinha ligada");
//				umAmbiente = new Alarme(umAmbiente, false);
//				umAmbiente.setDescricao("Alarme familia cozinha desligado");
//				return umAmbiente;
//			}
//		}else
//			return null;
//	}	
	
	
	//MODO 2
//	public Ambiente getAmbiente(String ambiente) {
//		if (ambiente.equals("quarto"))
//				return new Quarto();
//		else if (ambiente.equals("sala"))
//			return new Sala();
//		else if (ambiente.equals("cozinha")) 
//			return new Cozinha();
//		else
//			return null;
//	}
	
	
	//MODO 1
//	public Ambiente construir(Ambiente umAmbiente) {
//		if (umAmbiente.getNome() == "Cozinha") {
//			umAmbiente = new Luz(umAmbiente, true);
//			umAmbiente = new Alarme(umAmbiente, false);
//			return umAmbiente;
//		} else if (umAmbiente.getNome() == "Sala") {
//			umAmbiente = new Luz(umAmbiente, true);
//			return umAmbiente;
//		} else if (umAmbiente.getNome() == "Quarto") {
//			umAmbiente = new Luz(umAmbiente, true);
//			umAmbiente = new Aquecedor(umAmbiente, false);
//			return umAmbiente;
//		} else
//			return null;
//	}
	
	
	//MODO 1 ALTERNATIVO
	public Ambiente construir(Ambiente umAmbiente, String modo) {
		if (umAmbiente.getNome() == "Cozinha") {
			if (modo.equalsIgnoreCase("festa")) {
				umAmbiente.setDispositivo(new Alarme(umAmbiente, true));
				umAmbiente.setDispositivo(new Luz(umAmbiente, true));
				umAmbiente = new Luz(umAmbiente, true);
				umAmbiente.setDescricao("Luz festa cozinha ligada");
				umAmbiente = new Alarme(umAmbiente, true);
				umAmbiente.setDescricao("Alarme festa cozinha ligado");
				return umAmbiente;
			} else if (modo.equalsIgnoreCase("economia")) {
				umAmbiente.setDispositivo(new Alarme(umAmbiente, false));
				umAmbiente.setDispositivo(new Luz(umAmbiente, false));
				umAmbiente = new Luz(umAmbiente, false);
				umAmbiente.setDescricao("Luz economia cozinha desligada");
				umAmbiente = new Alarme(umAmbiente, false);
				umAmbiente.setDescricao("Alarme economia cozinha desligado");
				return umAmbiente;
			}else if (modo.equalsIgnoreCase("familia")) {
				umAmbiente.setDispositivo(new Alarme(umAmbiente, true));
				umAmbiente.setDispositivo(new Luz(umAmbiente, true));
				umAmbiente = new Luz(umAmbiente, true);
				umAmbiente.setDescricao("Luz familia cozinha ligada");
				umAmbiente = new Alarme(umAmbiente, true);
				umAmbiente.setDescricao("Alarme familia cozinha ligado");
				return umAmbiente;
			}
		}
		else if (umAmbiente.getNome() == "Sala") {
			if (modo.equalsIgnoreCase("festa")) {
				umAmbiente.setDispositivo(new Luz(umAmbiente, true));
				umAmbiente = new Luz(umAmbiente, true);
				umAmbiente.setDescricao("Luz festa sala ligada");
				return umAmbiente;
			} else if (modo.equalsIgnoreCase("economia")) {
				umAmbiente.setDispositivo(new Luz(umAmbiente, false));
				umAmbiente = new Luz(umAmbiente, false);
				umAmbiente.setDescricao("Luz economia sala desligada");
				return umAmbiente;
			} else if (modo.equalsIgnoreCase("familia")) {
				umAmbiente.setDispositivo(new Luz(umAmbiente, true));
				umAmbiente = new Luz(umAmbiente, true);
				umAmbiente.setDescricao("Luz familia sala ligada");
				return umAmbiente;
			}
		}
		else if (umAmbiente.getNome() == "Quarto") {
			if (modo.equalsIgnoreCase("festa")) {
				umAmbiente.setDispositivo(new Luz(umAmbiente, true));
				umAmbiente.setDispositivo(new Aquecedor(umAmbiente, false));
				umAmbiente = new Luz(umAmbiente, true);
				umAmbiente.setDescricao("Luz festa quarto ligada");
				umAmbiente = new Aquecedor(umAmbiente, false);
				umAmbiente.setDescricao("Aquecedor festa quarto ligado");
				return umAmbiente;
			} else if (modo.equalsIgnoreCase("economia")) {
				umAmbiente.setDispositivo(new Luz(umAmbiente, false));
				umAmbiente.setDispositivo(new Aquecedor(umAmbiente, false));
				umAmbiente = new Luz(umAmbiente, false);
				umAmbiente.setDescricao("Luz economia quarto desligada");
				umAmbiente = new Aquecedor(umAmbiente, false);
				umAmbiente.setDescricao("Aquecedor economia quarto desligado");
				return umAmbiente;
			} else if (modo.equalsIgnoreCase("familia")) {
				umAmbiente.setDispositivo(new Luz(umAmbiente, true));
				umAmbiente.setDispositivo(new Aquecedor(umAmbiente, true));
				umAmbiente = new Luz(umAmbiente, true);
				umAmbiente.setDescricao("Luz faimlia quarto ligada");
				umAmbiente = new Aquecedor(umAmbiente, true);
				umAmbiente.setDescricao("Aquecedor familia quarto ligado");
				return umAmbiente;
			}
		} else
			return null;
		return null;
	}
	
	
	//MODO 2
//	public Ambiente construir(Ambiente umAmbiente, String modo) {
//		if (umAmbiente.getNome() == "Cozinha") {
//			if (modo.equals("festa")) {
//				Cozinha cozinha = new Cozinha();
//				cozinha.modoFesta();
//				umAmbiente = new Luz(cozinha, true);
//				umAmbiente.setDescricao("Luz de festa - cozinha");
//				umAmbiente = new Alarme(umAmbiente, true);
//				umAmbiente.setDescricao("Alarme ligado para festa -  cozinha");
//				return umAmbiente;
//			} else if (modo.equals("economia")) {
//				Cozinha cozinha = new Cozinha();
//				cozinha.modoEconomia();
//				umAmbiente = new Luz(cozinha, true);
//				umAmbiente.setDescricao("Luz de economia - cozinha");
//				umAmbiente = new Alarme(umAmbiente, false);
//				umAmbiente.setDescricao("Alarme economia desligado -  cozinha");
//				return umAmbiente;
//			} else if (modo.equals("familia")) {
//				Cozinha cozinha = new Cozinha();
//				umAmbiente = new Luz(cozinha, true);
//				umAmbiente.setDescricao("Luz ambiente familia - cozinha");
//				umAmbiente = new Alarme(umAmbiente, true);
//				umAmbiente.setDescricao("Alarme ambiente familia ligado - cozinha");
//				return umAmbiente;
//			}
//		} else if (umAmbiente.getNome() == "Sala") {
//			if (modo.equals("festa")) {
//				Sala sala = new Sala();
//				sala.modoFesta();
//				umAmbiente = new Luz(sala, true);
//				umAmbiente.setDescricao("Luz de festa - sala");
//				return umAmbiente;
//			} else if (modo.equals("economia")) {
//				Sala sala = new Sala();
//				sala.modoEconomia();
//				umAmbiente = new Luz(sala, true);
//				umAmbiente.setDescricao("Luz de economia - sala");
//				return umAmbiente;
//			} else if (modo.equals("familia")) {
//				Sala sala = new Sala();
//				umAmbiente = new Luz(sala, true);
//				umAmbiente.setDescricao("Luz ambiente familia - sala");
//				return umAmbiente;
//			}
//		} else if (umAmbiente.getNome() == "Quarto") {
//			if (modo.equals("festa")) {
//				Quarto quarto = new Quarto();
//				quarto.modoFesta();
//				umAmbiente = new Luz(quarto, true);
//				umAmbiente.setDescricao("Luz de festa");
//				umAmbiente = new Aquecedor(umAmbiente, true);
//				umAmbiente.setDescricao("Aquecedor festa ligado - quarto");
//				return umAmbiente;
//			} else if (modo.equals("economia")) {
//				Quarto quarto = new Quarto();
//				quarto.ModoEconomia();
//				umAmbiente = new Luz(quarto, true);
//				umAmbiente.setDescricao("Luz de economia");
//				umAmbiente = new Aquecedor(umAmbiente, false);
//				umAmbiente.setDescricao("Aquecedor de economia desligado - quarto");
//				return umAmbiente;
//			} else if (modo.equals("familia")) {
//				Quarto quarto = new Quarto();
//				umAmbiente = new Luz(quarto, true);
//				umAmbiente.setDescricao("Luz ambiente familia");
//				umAmbiente = new Aquecedor(umAmbiente, true);
//				umAmbiente.setDescricao("Aquecedor de familia ligado - quarto");
//				return umAmbiente;
//			}
//		} else
//			return null;
//		return null;
//	}
	
}

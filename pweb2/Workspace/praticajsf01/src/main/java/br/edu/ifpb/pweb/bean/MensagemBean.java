package br.edu.ifpb.pweb.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value="msgBean")
@RequestScoped
public class MensagemBean {
	String mensagem = "Bem vindo ao JSF";

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
}

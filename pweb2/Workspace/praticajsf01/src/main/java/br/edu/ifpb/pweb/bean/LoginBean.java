package br.edu.ifpb.pweb.bean;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value="loginBean")
@RequestScoped
public class LoginBean {
	String login;
	String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String autentique() {
		if (login.equals("admin") && senha.equals("changeit")) {
			return "sucesso?faces-redirect=true";
		}
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_WARN,
				"Usuário e/ou senha enválidos.",
				"Verifique se CAPSLOCK está ativada."));
		return null;
	}
}

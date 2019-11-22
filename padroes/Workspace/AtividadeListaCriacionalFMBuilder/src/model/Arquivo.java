package model;

public class Arquivo {
	
	private String nome;
	private String path;
	private String data;
	private String hora;
	private String proprietario;
	private String email;
	private boolean autoImpressao = false;
	private boolean autoCopia = false;
	
	public Arquivo() {}
	
	public Arquivo(String nome, String path) {
		this.nome = nome;
		this.path = path;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getAutoImpressao() {
		return autoImpressao;
	}

	public void setAutoImpressao(boolean autoImpressao) {
		this.autoImpressao = autoImpressao;
	}

	public boolean getAutoCopia() {
		return autoCopia;
	}

	public void setAutoCopia(boolean autoCopia) {
		this.autoCopia = autoCopia;
	}
	
	public Arquivo clonar() {
		if (this.getAutoCopia() == true) {
			return new Arquivo();
		}else return null;
	}
	
	public String ler() {
		return "Você está lendo o arquivo: "+this.getNome();
	}

	@Override
	public String toString() {
		return "Arquivo [nome=" + nome + ", path=" + path + ", data=" + data + ", hora=" + hora + ", proprietario="
				+ proprietario + ", email=" + email + ", autoImpressao=" + autoImpressao + ", autoCopia=" + autoCopia
				+ "]";
	}

}

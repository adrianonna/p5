package model;

public abstract class ArquivoPrototype {
	
	protected String nome;
	protected String path;
	protected boolean copy;
	protected String data;
	protected String hora;
	protected String proprietário;
	protected String email;
	
	public abstract String ler();
	public abstract String escrever();
	public abstract ArquivoPrototype clonar();
	
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
	
	public boolean getCopy() {
		return copy;
	}
	public void setCopy(boolean copy) {
		this.copy = copy;
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
	public String getProprietário() {
		return proprietário;
	}
	public void setProprietário(String proprietário) {
		this.proprietário = proprietário;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "ArquivoPrototype [nome=" + nome + ", path=" + path + ", copy=" + copy + ", data=" + data + ", hora="
				+ hora + ", proprietário=" + proprietário + ", email=" + email + "]";
	}
}

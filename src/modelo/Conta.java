package modelo;

public class Conta {
	private String email;
	private Senha senha;
	
	
	public Conta(String email, Senha senha) {
		super();
		this.email = email;
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Senha getSenha() {
		return senha;
	}
	public void setSenha(Senha senha) {
		this.senha = senha;
	}
	
	
}
